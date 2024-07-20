package com.luazevedo.emprestimos.repository;

import com.luazevedo.emprestimos.entity.Configuracao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfiguracaoRepository extends JpaRepository<Configuracao, Long> {
}
