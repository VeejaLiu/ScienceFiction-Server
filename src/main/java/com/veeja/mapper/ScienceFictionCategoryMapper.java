package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionBook;
import com.veeja.pojo.ScienceFictionCategory;

import java.util.List;

public interface ScienceFictionCategoryMapper extends BaseMapper<ScienceFictionCategory> {
    List<ScienceFictionCategory> selectAll();

}