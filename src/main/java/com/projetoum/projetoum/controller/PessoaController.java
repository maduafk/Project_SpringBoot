package com.projetoum.projetoum.controller;

import com.projetoum.projetoum.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping()
    public ResponseEntity<Object> buscaPessoas() {
        return ResponseEntity.ok(pessoaService.buscarPessoa());
    }


}
