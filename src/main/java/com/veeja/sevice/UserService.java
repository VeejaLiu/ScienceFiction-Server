package com.veeja.sevice;

import com.veeja.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
}
