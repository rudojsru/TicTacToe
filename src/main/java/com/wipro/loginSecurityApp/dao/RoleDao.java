package com.wipro.loginSecurityApp.dao;

import com.wipro.loginSecurityApp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Long> {

}
