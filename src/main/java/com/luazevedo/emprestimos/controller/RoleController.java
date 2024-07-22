package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.Role;
import com.luazevedo.emprestimos.service.AbstractCRUDService;
import com.luazevedo.emprestimos.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public abstract class RoleController implements CrudController<Role, Long> {

    @Autowired
    private RoleService roleService;

    @Override
    @GetMapping
    public ResponseEntity<List<Role>> findAll() {
        List<Role> list = roleService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Role> findById(@PathVariable Long id) {
        Role role = roleService.findById(id);
        return ResponseEntity.ok().body(role);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Role> update(@PathVariable Long id, @RequestBody Role role) {
        role.setId(id);
        Role updatedRole = roleService.save(role);
        return ResponseEntity.ok().body(updatedRole);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        roleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}