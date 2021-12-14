package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuweijia
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();
}