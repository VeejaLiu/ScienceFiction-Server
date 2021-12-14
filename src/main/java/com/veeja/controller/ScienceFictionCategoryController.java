package com.veeja.controller;

import com.veeja.pojo.ScienceFictionBook;
import com.veeja.pojo.ScienceFictionCategory;
import com.veeja.sevice.ScienceFictionCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ScienceFictionCategoryController {
    @Resource
    private ScienceFictionCategoryService scienceFictionCategoryService;

    @GetMapping("/getAllCategories")
    @ResponseBody
    public List<ScienceFictionCategory> selectAll() {
        List<ScienceFictionCategory> categories = scienceFictionCategoryService.selectAll();
        return categories;
    }
}
