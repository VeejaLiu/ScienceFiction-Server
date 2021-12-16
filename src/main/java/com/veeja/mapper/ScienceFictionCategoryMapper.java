package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionCategory;

import java.util.List;

/**
 * @author liuweijia
 */
public interface ScienceFictionCategoryMapper extends BaseMapper<ScienceFictionCategory> {
    List<ScienceFictionCategory> selectAll();

}