package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.Configuracao;
import com.luazevedo.emprestimos.service.AbstractCRUDService;
import com.luazevedo.emprestimos.service.ConfiguracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/configuracoes")
public abstract class ConfiguracaoController implements CrudController<Configuracao, Long> {

    @Autowired
    private ConfiguracaoService configuracaoService;

    @Override
    @GetMapping
    public ResponseEntity<List<Configuracao>> findAll() {
        List<Configuracao> list = configuracaoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Configuracao> findById(@PathVariable Long id) {
        Configuracao configuracao = configuracaoService.findById(id);
        return ResponseEntity.ok().body(configuracao);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Configuracao> update(@PathVariable Long id, @RequestBody Configuracao configuracao) {
        configuracao.setId(id);
        Configuracao updatedConfiguracao = configuracaoService.save(configuracao);
        return ResponseEntity.ok().body(updatedConfiguracao);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        configuracaoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}