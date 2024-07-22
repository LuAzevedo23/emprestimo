package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.HistoricoEmprestimo;
import com.luazevedo.emprestimos.repository.HistoricoEmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class HistoricoEmprestimoService extends AbstractCRUDService<HistoricoEmprestimo, Long> {

    @Autowired
    private HistoricoEmprestimoRepository historicoEmprestimoRepository;

    @Override
    protected JpaRepository<HistoricoEmprestimo, Long> getRepository() {
        return historicoEmprestimoRepository;
    }
}

