package com.luazevedo.emprestimos.repository;

import com.luazevedo.emprestimos.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
