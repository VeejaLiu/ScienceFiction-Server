package com.veeja.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.veeja.dto.UploadBook;
import com.veeja.dto.book.GetAllBookResult;
import com.veeja.mapper.AuthorMapper;
import com.veeja.mapper.BookMapper;
import com.veeja.mapper.FileMapper;
import com.veeja.pojo.Author;
import com.veeja.pojo.Book;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.service.AuthorService;
import com.veeja.service.BookService;
import jakarta.annotation.Resource;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Resource
    private FileMapper fileMapper;
    @Resource
    private AuthorMapper authorMapper;
    @Resource
    private AuthorService authorService;

    @Override
    public GetAllBookResult selectAll(Integer offset, Integer limit, String keyword) {
        GetAllBookResult result = new GetAllBookResult();
        result.setBooks(bookMapper.selectAll(offset, limit, keyword));
        Wrapper wrapper = new QueryWrapper<Book>().like("book_name", keyword);
        result.setTotal(bookMapper.selectCount(wrapper));
        return result;
    }

    @Override
    public void uploadBook(UploadBook uploadBook) {
        try {
            // 获取文件名
            String bookName = uploadBook.getBook_name();

            // 获取作者姓名
            String bookAuthor = uploadBook.getBook_author();

            // 获取文件，并处理文件
            MultipartFile file = uploadBook.getFile();
            if (!file.isEmpty()) {
                // 保存文件
                String oldFileName = file.getOriginalFilename();
                String path = getNewFilePath(oldFileName);
                String randomStr = UUID.randomUUID().toString();
                String newFileName = randomStr + "-" + oldFileName;
                File newFile = new File(path, newFileName);
                if (!newFile.getParentFile().exists()) {
                    newFile.getParentFile().mkdirs();
                }
                file.transferTo(newFile);

                // 保存文件信息
                Long fileSize = file.getSize();

                ScienceFictionFile bookFile = new ScienceFictionFile();
                bookFile.setFileSize(fileSize);
                bookFile.setPath(path + newFileName);
                bookFile.setFileName(newFileName);
                fileMapper.insert(bookFile);

                // 保存作者信息
                Author author = new Author();
                author.setAuthorFirstName(bookAuthor);
                author = authorService.getAuthor(author);

                // 保存书籍信息
                Book book = new Book();
                book.setBookFilePath(bookFile.getId());
                book.setBookAuthor(author.getId());
                book.setBookName(bookName);
                bookMapper.insert(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Book getOneById(Integer id) {
        return bookMapper.getOneById(id);
    }

    private String getNewFilePath(String oldFileName) {
        String path = "/Users/liuweijia/data/SCIENCE-FICTION";
        DateTime now = new DateTime();
        int year = now.getYear();
        int month = now.getMonthOfYear();
        int day = now.getDayOfMonth();
        path += "/" + year + "/" + month + "/" + day + "/";
        return path;
    }
}

