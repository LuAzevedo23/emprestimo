package com.luazevedo.emprestimos.repository;

import com.luazevedo.emprestimos.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
