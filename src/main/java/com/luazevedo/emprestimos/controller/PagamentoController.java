package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.Pagamento;
import com.luazevedo.emprestimos.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public abstract class PagamentoController implements CrudController<Pagamento, Long> {

    @Autowired
    private PagamentoService pagamentoService;

    @Override
    public ResponseEntity<List<Pagamento>> findAll() {
        List<Pagamento> list = pagamentoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Override
    public ResponseEntity<Pagamento> findById(Long id) {
        Pagamento pagamento = pagamentoService.findById(id);
        return ResponseEntity.ok().body(pagamento);
    }

    @Override
    public ResponseEntity<Pagamento> update(Long id, @RequestBody Pagamento pagamento) {
        pagamento.setId(id);
        Pagamento updatedPagamento = pagamentoService.save(pagamento);
        return ResponseEntity.ok().body(updatedPagamento);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        pagamentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}