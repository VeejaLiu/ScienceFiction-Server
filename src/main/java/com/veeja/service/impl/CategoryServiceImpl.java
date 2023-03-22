package com.veeja.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.veeja.mapper.CategoryMapper;
import com.veeja.pojo.Category;
import com.veeja.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;


    @Override
    public List<Category> selectAll() {
        return categoryMapper.selectAll();
    }
}
