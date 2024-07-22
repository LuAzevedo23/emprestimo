package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.Cliente;
import com.luazevedo.emprestimos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends AbstractCRUDService<Cliente, Long> {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    protected JpaRepository<Cliente, Long> getRepository() {
        return clienteRepository;
    }
}

