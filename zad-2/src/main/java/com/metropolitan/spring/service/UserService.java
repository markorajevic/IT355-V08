package com.metropolitan.spring.service;

import java.util.List;

import com.metropolitan.spring.entity.User;

public interface UserService {

    void add(User user);

    List<User> listUsers();
}
