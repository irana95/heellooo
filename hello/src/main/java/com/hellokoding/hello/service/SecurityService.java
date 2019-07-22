package com.hellokoding.hello.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
