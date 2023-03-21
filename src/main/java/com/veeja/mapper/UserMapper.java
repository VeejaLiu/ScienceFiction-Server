package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.User;

import java.util.List;

/**
 * 用户mapper
 * @author liuweijia
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询所有用户
     */
    List<User> selectAll();
}