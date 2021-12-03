package com.moy.maven.service.impl;

import java.util.List;

import org.moy.maven.domain.User;
import org.moy.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moy.maven.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.select(null);
    }

    @Override
    public User get(Integer userId) {
        return userMapper.get(userId);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user.getId());
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}