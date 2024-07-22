package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CrudController<T, ID> {

    @GetMapping
    ResponseEntity<List<T>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<T> findById(@PathVariable ID id);

    @PutMapping("/{id}")
    ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity);

    @PutMapping("/{id}")
    ResponseEntity<Role> update(@PathVariable Long id, @RequestBody Role role);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable ID id);
}

