package com.veeja.controller;

import com.veeja.pojo.ScienceFictionAuthor;
import com.veeja.service.ScienceFictionAuthorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuweijia
 */
@RestController
@RequestMapping("author")
public class ScienceFictionAuthorController {
    @Resource
    private ScienceFictionAuthorService scienceFictionAuthorService;

    @GetMapping("getAllAuthor")
    @ResponseBody
    public List<ScienceFictionAuthor> selectAll() {
        List<ScienceFictionAuthor> authors = scienceFictionAuthorService.selectAll();
        return authors;
    }

    @PostMapping(value = "updateAuthor", produces = "application/json;charset=UTF-8")
    public String updateAuthor(@RequestBody ScienceFictionAuthor author) {
        scienceFictionAuthorService.updateAuthor(author);
        return "success";
    }
}
