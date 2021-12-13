package com.moy.maven.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.moy.maven.domain.User;
import org.moy.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.moy.maven.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<User> findAll() {
        redisTemplate.opsForHash().put("map1_data5", "A", "A123");
        redisTemplate.opsForHash().put("map1_data5", "B", "B123");
    	redisTemplate.opsForValue().set("qq5", "99999999999999999999999");
    	String obj = (String) redisTemplate.opsForValue().get("qq5");
    	System.out.println("String的value------------"+obj);
    	Map<String,String> objHash = redisTemplate.boundHashOps("map1_data5").entries();
    	System.out.println("Hash的value------------"+objHash);
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