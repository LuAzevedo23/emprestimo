package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.Emprestimo;
import com.luazevedo.emprestimos.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public abstract class EmprestimoController implements CrudController<Emprestimo, Long> {

    @Autowired
    private EmprestimoService emprestimoService;

    @Override
    @GetMapping
    public ResponseEntity<List<Emprestimo>> findAll() {
        List<Emprestimo> list = emprestimoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Emprestimo> findById(@PathVariable Long id) {
        Emprestimo emprestimo = emprestimoService.findById(id);
        return ResponseEntity.ok().body(emprestimo);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Emprestimo> update(@PathVariable Long id, @RequestBody Emprestimo emprestimo) {
        emprestimo.setId(id);
        Emprestimo updatedEmprestimo = emprestimoService.save(emprestimo);
        return ResponseEntity.ok().body(updatedEmprestimo);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        emprestimoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

