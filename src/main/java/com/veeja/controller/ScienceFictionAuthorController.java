package com.veeja.controller;

import com.veeja.pojo.ScienceFictionAuthor;
import com.veeja.sevice.ScienceFictionAuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuweijia
 */
@RestController
public class ScienceFictionAuthorController {
    @Resource
    private ScienceFictionAuthorService scienceFictionAuthorService;

    @GetMapping("/getAllAuthors")
    @ResponseBody
    public List<ScienceFictionAuthor> selectAll() {
        List<ScienceFictionAuthor> authors = scienceFictionAuthorService.selectAll();
        return authors;
    }
}
