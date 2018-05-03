package com.wipro.TicTacToeApp.dao;

import com.wipro.TicTacToeApp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Long> {

}
