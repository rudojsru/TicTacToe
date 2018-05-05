package com.wipro.loginSecurityApp.service;

import com.wipro.loginSecurityApp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);



}
