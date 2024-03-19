package com.projetoum.projetoum.service;

import com.projetoum.projetoum.entity.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    public Pessoa buscarPessoa() {
        Pessoa p = new Pessoa(1L, "Maria Eduarda Viana", "A+");
        return p;

    }
}
