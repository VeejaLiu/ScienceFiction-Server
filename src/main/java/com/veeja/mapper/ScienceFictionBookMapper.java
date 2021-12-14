package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ScienceFictionBookMapper extends BaseMapper<ScienceFictionBook> {
    List<ScienceFictionBook> selectAll();
}