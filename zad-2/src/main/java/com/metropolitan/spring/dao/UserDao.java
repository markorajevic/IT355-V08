package com.metropolitan.spring.dao;

import java.util.List;

import com.metropolitan.spring.entity.User;

public interface UserDao {

    void add(User user);

    List<User> listUsers();
}
