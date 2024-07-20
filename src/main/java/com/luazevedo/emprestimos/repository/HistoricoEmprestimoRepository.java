package com.luazevedo.emprestimos.repository;

import com.luazevedo.emprestimos.entity.HistoricoEmprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoEmprestimoRepository extends JpaRepository<HistoricoEmprestimo, Long> {
}
