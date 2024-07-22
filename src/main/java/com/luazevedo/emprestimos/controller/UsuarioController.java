package com.luazevedo.emprestimos.controller;

import com.luazevedo.emprestimos.entity.Role;
import com.luazevedo.emprestimos.entity.Usuario;
import com.luazevedo.emprestimos.service.AbstractCRUDService;
import com.luazevedo.emprestimos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public abstract class UsuarioController implements CrudController<Usuario, Long> {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> list = usuarioService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        Usuario usuario = usuarioService.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario usuario) {
       usuario.setId(id);
       Usuario updatedUsuario = usuarioService.save(usuario);
       return ResponseEntity.ok().body(updatedUsuario);

    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}