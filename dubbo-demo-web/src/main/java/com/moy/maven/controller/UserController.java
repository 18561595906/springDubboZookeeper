package com.moy.maven.controller;

import java.util.List;

import org.moy.maven.domain.User;
import org.moy.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> listUser() {
        List<User> userList = userService.findAll();
        return userList;
    }
}