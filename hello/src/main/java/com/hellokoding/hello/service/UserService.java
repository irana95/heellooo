package com.hellokoding.hello.service;


import com.hellokoding.hello.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
