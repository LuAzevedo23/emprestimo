package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.Usuario;
import com.luazevedo.emprestimos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends AbstractCRUDService<Usuario, Long> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    protected JpaRepository<Usuario, Long> getRepository() {
        return usuarioRepository;
    }
}

