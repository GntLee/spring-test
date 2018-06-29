package com.dao;

import com.bean.User;

import java.util.List;

/**
 * @Author Lee
 * @Date 2018/6/29 11:07
 */
public interface UserDao {

    public void save(User user);

    public List<User> findAll();
}
