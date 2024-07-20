package com.luazevedo.emprestimos.repository;

import com.luazevedo.emprestimos.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
