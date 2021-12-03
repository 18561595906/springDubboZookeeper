package org.moy.maven.service;

import java.util.List;

import org.moy.maven.domain.User;

public interface UserService {
	

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据主键查询用户
     * @param userId
     * @return
     */
    User get(Integer userId);

    /**
     * 新增用户
     * @param user
     */
    void add(User user);

    /**
     * 根据主键删除用户
     * @param user
     */
    void delete(User user);

    /**
     * 修改用户
     * @param user
     */
    void update(User user);

}
