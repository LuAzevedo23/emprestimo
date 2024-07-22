package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.Garantia;
import com.luazevedo.emprestimos.repository.GarantiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class GarantiaService extends AbstractCRUDService<Garantia, Long> {

    @Autowired
    private GarantiaRepository garantiaRepository;

    @Override
    protected JpaRepository<Garantia, Long> getRepository() {
        return garantiaRepository;
    }
}

