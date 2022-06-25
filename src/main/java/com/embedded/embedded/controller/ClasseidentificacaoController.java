package com.embedded.embedded.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.embedded.embedded.model.Identificacao;
import com.embedded.embedded.repository.ClasseIdentificacaoRepository;

@RestController
@RequestMapping({ "/api" })
public class ClasseidentificacaoController {

       private ClasseIdentificacaoRepository repository;

    ClasseidentificacaoController(ClasseIdentificacaoRepository model) {
        this.repository = model;
    }

    @GetMapping
    public List<Identificacao> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Identificacao create(@RequestBody Identificacao model){
    return repository.save(model);
}
    
}
