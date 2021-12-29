package com.veeja.controller;

import com.veeja.dto.UploadBook;
import com.veeja.pojo.ScienceFictionBook;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.service.ScienceFictionBookService;
import com.veeja.service.ScienceFictionFileService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author liuweijia
 */
@RestController
@RequestMapping("book")
public class ScienceFictionBookController {
    @Resource
    private ScienceFictionBookService scienceFictionBookService;

    @Resource
    private ScienceFictionFileService scienceFictionFileService;

    @GetMapping("getAllBook")
    @ResponseBody
    public List<ScienceFictionBook> selectAll() {
        List<ScienceFictionBook> books = scienceFictionBookService.selectAll();
        return books;
    }

    @PostMapping("uploadBook")
    public String uploadBook(UploadBook uploadBook) throws IOException {
        scienceFictionBookService.uploadBook(uploadBook);
        return "success";
    }

    @GetMapping("/downloadBookByID")
    @ResponseBody
    public void downloadBook(HttpServletResponse response, @RequestHeader("user-agent") String userAgent, @Param("id") Integer id) throws IOException {
        ScienceFictionBook book = scienceFictionBookService.getOneById(id);
        ScienceFictionFile file = scienceFictionFileService.getOneById(book.getBookFilePath());
        File bookFile = new File(file.getPath());
        // 两个头
        // 通过文件名称获取文件MIME类型
        String contentType = "text/txt";
        String contentDisposition = "attachment;filename="+file.getFileName();
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
