package com.veeja.service.impl;

import com.veeja.mapper.UserMapper;
import com.veeja.pojo.User;
import com.veeja.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
