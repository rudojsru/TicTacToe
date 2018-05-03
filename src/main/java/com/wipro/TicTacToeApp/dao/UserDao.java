package com.wipro.TicTacToeApp.dao;

import com.wipro.TicTacToeApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
