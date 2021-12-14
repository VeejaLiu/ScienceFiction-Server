package com.veeja.sevice.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.veeja.mapper.ScienceFictionCategoryMapper;
import com.veeja.pojo.ScienceFictionCategory;
import com.veeja.sevice.ScienceFictionCategoryService;

import java.util.List;

@Service
public class ScienceFictionCategoryServiceImpl implements ScienceFictionCategoryService{

    @Resource
    private ScienceFictionCategoryMapper scienceFictionCategoryMapper;


    @Override
    public List<ScienceFictionCategory> selectAll() {
        return scienceFictionCategoryMapper.selectAll();
    }
}
