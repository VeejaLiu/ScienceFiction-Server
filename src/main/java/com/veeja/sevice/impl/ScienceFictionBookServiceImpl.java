package com.veeja.sevice.impl;

import com.veeja.dto.UploadBook;
import com.veeja.mapper.ScienceFictionAuthorMapper;
import com.veeja.mapper.ScienceFictionBookMapper;
import com.veeja.mapper.ScienceFictionFileMapper;
import com.veeja.pojo.ScienceFictionAuthor;
import com.veeja.pojo.ScienceFictionBook;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.sevice.ScienceFictionAuthorService;
import com.veeja.sevice.ScienceFictionBookService;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class ScienceFictionBookServiceImpl implements ScienceFictionBookService {
    @Resource
    private ScienceFictionBookMapper scienceFictionBookMapper;
    @Resource
    private ScienceFictionFileMapper scienceFictionFileMapper;
    @Resource
    private ScienceFictionAuthorMapper scienceFictionAuthorMapper;
    @Resource
    private ScienceFictionAuthorService scienceFictionAuthorService;

    @Override
    public List<ScienceFictionBook> selectAll() {
        return scienceFictionBookMapper.selectAll();
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
                Number fileSize = file.getSize();

                ScienceFictionFile bookFile = new ScienceFictionFile();
                bookFile.setFileSize((Long) fileSize);
                bookFile.setPath(path + newFileName);
                bookFile.setFileName(newFileName);
                scienceFictionFileMapper.insert(bookFile);

                // 保存作者信息
                ScienceFictionAuthor author = new ScienceFictionAuthor();
                author.setAuthorFirstName(bookAuthor);
                author = scienceFictionAuthorService.getAuthor(author);

                // 保存书籍信息
                ScienceFictionBook book = new ScienceFictionBook();
                book.setBookFilePath(bookFile.getId());
                book.setBookAuthor(author.getId());
                book.setBookName(bookName);
                scienceFictionBookMapper.insert(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getNewFilePath(String oldFileName) {
        String path = "/Users/liuweijia/data/SCIENCE-FICTION";
        DateTime now = new DateTime();
        int year = now.getYear();
        int month = now.getMonthOfYear();
        int day = now.getDayOfMonth();
        path += "/" + year + "/" + month + "/" + day;
        return path;
    }
}

