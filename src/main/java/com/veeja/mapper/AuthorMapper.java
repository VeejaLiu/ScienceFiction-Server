package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.Author;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author Mapper
 *
 * @author liuweijia
 */
public interface AuthorMapper extends BaseMapper<Author> {
    /**
     * 获取全部作者信息
     *
     * @return
     */
    List<Author> selectAll();

    /**
     * 根据名字获取作者信息
     *
     * @param firstName
     * @return
     */
    Author selectAuthorByFirstName(@Param("firstName") String firstName);
}