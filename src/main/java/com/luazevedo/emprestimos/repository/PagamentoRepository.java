package com.luazevedo.emprestimos.repository;


import com.luazevedo.emprestimos.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
