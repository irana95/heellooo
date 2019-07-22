package com.hellokoding.hello.repository;

import com.hellokoding.hello.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
