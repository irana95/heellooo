package com.hellokoding.hello.service;

import com.hellokoding.hello.model.User;
import com.hellokoding.hello.repository.RoleRepository;
import com.hellokoding.hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Locale;

@Service
public class UserServiceImpl implements UserService {
    @Autowired

    private UserRepository userRepository;
    @Autowired

    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {

        Locale.setDefault(Locale.ENGLISH);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        Locale.setDefault(Locale.ENGLISH);
        return userRepository.findByUsername(username);
    }
}
