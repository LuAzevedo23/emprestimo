package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.Pagamento;
import com.luazevedo.emprestimos.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService extends AbstractCRUDService<Pagamento, Long> {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Override
    protected JpaRepository<Pagamento, Long> getRepository() {
        return pagamentoRepository;
    }
}

