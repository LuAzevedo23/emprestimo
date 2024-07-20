package com.luazevedo.emprestimos.repository;

import com.luazevedo.emprestimos.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
