package com.veeja.controller;

import com.veeja.dto.UploadBook;
import com.veeja.dto.book.GetAllBookResult;
import com.veeja.pojo.Book;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.service.BookService;
import com.veeja.service.ScienceFictionFileService;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author liuweijia
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("books")
public class BookController {
    @Resource
    private BookService bookService;

    @Resource
    private ScienceFictionFileService fileService;

    /**
     * 获取所有书籍
     *
     * @param offset  页码
     * @param limit   每页数量
     * @param keyword 关键字
     * @return 所有书籍
     */
    @GetMapping("")
    @ResponseBody
    public GetAllBookResult selectAll(@RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit, @RequestParam("bookName") String keyword) {
        return bookService.selectAll(offset, limit, keyword);
    }


    @PostMapping("/uploadBook")
    public String uploadBook(UploadBook uploadBook) throws IOException {
        bookService.uploadBook(uploadBook);
        return "success";
    }

    @GetMapping("/downloadBookByID")
    @ResponseBody
    public void downloadBook(HttpServletResponse response, @RequestHeader("user-agent") String userAgent, @Param("id") Integer id) throws IOException {
        Book book = bookService.getOneById(id);
        ScienceFictionFile file = fileService.getOneById(book.getBookFilePath());
        File bookFile = new File(file.getPath());
        // 两个头
        // 通过文件名称获取文件MIME类型
        String contentType = "text/txt";
        String contentDisposition = "attachment;filename=" + file.getFileName();
        // 创建一个数据流
        FileInputStream input = new FileInputStream(file.getPath());

        // 接下来设置头
        response.setHeader("Content-Type", contentType);
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Disposition", contentDisposition);
        response.setHeader("Connection", "close");
        //设置传输的类型
        response.setHeader("Content-Type", "application/octet-stream");
        response.setHeader("Content-Transfer-Encoding", "chunked");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setContentType("application/OCTET-STREAM");

        // 获取绑定的客户端的流
        ServletOutputStream output = response.getOutputStream();
        // 把输入流的东西写入到输出流中
        IOUtils.copy(input, output);
        input.close();
    }
}
