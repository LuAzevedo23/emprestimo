package com.luazevedo.emprestimos.repository;

import com.luazevedo.emprestimos.entity.Garantia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarantiaRepository extends JpaRepository<Garantia, Long> {
}
