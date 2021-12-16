package com.veeja.controller;

import com.veeja.dto.UploadBook;
import com.veeja.pojo.ScienceFictionBook;
import com.veeja.sevice.ScienceFictionBookService;
import org.joda.time.DateTime;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author liuweijia
 */
@RestController
public class ScienceFictionBookController {
    @Resource
    private ScienceFictionBookService scienceFictionBookService;

    @GetMapping("/getAllBooks")
    @ResponseBody
    public List<ScienceFictionBook> selectAll() {
        List<ScienceFictionBook> books = scienceFictionBookService.selectAll();
        return books;
    }

    @PostMapping("/book/uploadBook")
    public String uploadBook(UploadBook uploadBook) throws IOException {
        scienceFictionBookService.uploadBook(uploadBook);
        return "success";
    }
}
