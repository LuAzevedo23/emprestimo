package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.Cliente;
import com.luazevedo.emprestimos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public abstract class ClienteController implements CrudController<Cliente, Long> {

    @Autowired
    private ClienteService clienteService;

    @Override
    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> list = clienteService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        Cliente cliente = clienteService.findById(id);
        return ResponseEntity.ok().body(cliente);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        Cliente updatedCliente = clienteService.save(cliente);
        return ResponseEntity.ok().body(updatedCliente);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
       clienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
