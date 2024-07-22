package com.luazevedo.emprestimos.service;

import com.luazevedo.emprestimos.entity.Configuracao;
import com.luazevedo.emprestimos.repository.ConfiguracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class ConfiguracaoService extends AbstractCRUDService<Configuracao, Long> {

    @Autowired
    private ConfiguracaoRepository configuracaoRepository;

    @Override
    protected JpaRepository<Configuracao, Long> getRepository() {
        return configuracaoRepository;
    }
}


