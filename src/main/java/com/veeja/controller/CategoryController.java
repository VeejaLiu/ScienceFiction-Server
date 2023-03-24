package com.veeja.controller;

import com.veeja.pojo.Category;
import com.veeja.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @GetMapping("getAllCategory")
    @ResponseBody
    public List<Category> selectAll() {
        List<Category> categories = categoryService.selectAll();
        return categories;
    }
}
