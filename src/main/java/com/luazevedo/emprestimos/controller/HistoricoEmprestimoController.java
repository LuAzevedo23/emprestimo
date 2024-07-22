package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.HistoricoEmprestimo;
import com.luazevedo.emprestimos.service.AbstractCRUDService;
import com.luazevedo.emprestimos.service.HistoricoEmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historico_emprestimos")
public abstract class HistoricoEmprestimoController implements CrudController<HistoricoEmprestimo, Long> {

    @Autowired
    private HistoricoEmprestimoService historicoEmprestimoservice;


    @Override
    @GetMapping
    public ResponseEntity<List<HistoricoEmprestimo>> findAll() {
        List<HistoricoEmprestimo> list = historicoEmprestimoservice.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<HistoricoEmprestimo> findById(@PathVariable Long id) {
        HistoricoEmprestimo historicoEmprestimo = historicoEmprestimoservice.findById(id);
        return ResponseEntity.ok().body(historicoEmprestimo);

    }

    @Override
    @PutMapping("/{id}")
        public ResponseEntity<HistoricoEmprestimo> update(@PathVariable Long id, @RequestBody HistoricoEmprestimo historicoEmprestimo) {
            historicoEmprestimo.setId(id);
            HistoricoEmprestimo updatedHistoricoEmprestimo = historicoEmprestimoservice.save(historicoEmprestimo);
            return ResponseEntity.ok().body(updatedHistoricoEmprestimo);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        historicoEmprestimoservice.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}