package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.Role;
import com.luazevedo.emprestimos.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractCRUDService<Role, Long> {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    protected JpaRepository<Role, Long> getRepository() {
        return roleRepository;
    }
}



