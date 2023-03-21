package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionAuthor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author Mapper
 *
 * @author liuweijia
 */
public interface ScienceFictionAuthorMapper extends BaseMapper<ScienceFictionAuthor> {
    /**
     * 获取全部作者信息
     *
     * @return
     */
    List<ScienceFictionAuthor> selectAll();

    /**
     * 根据名字获取作者信息
     *
     * @param firstName
     * @return
     */
    ScienceFictionAuthor selectAuthorByFirstName(@Param("firstName") String firstName);
}