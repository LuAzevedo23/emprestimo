package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.Emprestimo;
import com.luazevedo.emprestimos.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService extends AbstractCRUDService<Emprestimo, Long> {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @Override
    protected JpaRepository<Emprestimo, Long> getRepository() {
        return emprestimoRepository;
    }
}
