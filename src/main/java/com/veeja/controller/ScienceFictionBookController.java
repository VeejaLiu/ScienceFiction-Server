package com.veeja.controller;

import com.veeja.pojo.ScienceFictionBook;
import com.veeja.sevice.ScienceFictionBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
}
