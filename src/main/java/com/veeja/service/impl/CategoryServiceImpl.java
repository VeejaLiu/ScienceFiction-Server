package com.veeja.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.veeja.dto.category.GetAllCategoryResult;
import com.veeja.mapper.CategoryMapper;
import com.veeja.pojo.Category;
import com.veeja.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public GetAllCategoryResult selectAll(Integer offset, Integer limit, String keyword) {
        GetAllCategoryResult result = new GetAllCategoryResult();
        result.setCategories(categoryMapper.selectAll(offset, limit, keyword));
        Wrapper wrapper = Wrappers.<Category>lambdaQuery().like(StringUtils.isNotBlank(keyword), Category::getCategoryName, keyword.toLowerCase());
        result.setTotal(categoryMapper.selectCount(wrapper));
        return result;
    }
}
