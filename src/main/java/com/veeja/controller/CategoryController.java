package com.veeja.controller;

import com.veeja.dto.category.GetAllCategoryResult;
import com.veeja.pojo.Category;
import com.veeja.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("categories")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    /**
     * 获取所有分类
     *
     * @param offset  页码
     * @param limit   每页数量
     * @param keyword 关键字
     * @return 所有分类
     */
    @GetMapping(value = "", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public GetAllCategoryResult selectAll(@RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit, @RequestParam("keyword") String keyword) {
        GetAllCategoryResult categories = categoryService.selectAll(offset, limit, keyword);
        return categories;
    }
}
