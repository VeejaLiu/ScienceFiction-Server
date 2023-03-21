package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionCategory;

import java.util.List;


/**
 * 科幻小说目录表 Mapper 接口
 *
 * @author Veeja Liu
 */
public interface ScienceFictionCategoryMapper extends BaseMapper<ScienceFictionCategory> {
    /**
     * 查询所有目录
     *
     * @return 所有目录
     */
    List<ScienceFictionCategory> selectAll();

}