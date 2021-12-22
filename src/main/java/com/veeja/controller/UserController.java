package com.veeja.controller;

import com.veeja.pojo.User;
import com.veeja.sevice.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("getAllUser")
    @ResponseBody
    public List<User> selectAll() {
        List<User> users = userService.selectAll();
        return users;
    }
}
