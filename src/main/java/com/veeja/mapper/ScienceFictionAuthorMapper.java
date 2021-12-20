package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionAuthor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScienceFictionAuthorMapper extends BaseMapper<ScienceFictionAuthor> {
    List<ScienceFictionAuthor> selectAll();
    ScienceFictionAuthor selectAuthorByFirstName(@Param("firstName") String firstName);
}