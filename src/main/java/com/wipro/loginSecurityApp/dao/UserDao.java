package com.wipro.loginSecurityApp.dao;

import com.wipro.loginSecurityApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
