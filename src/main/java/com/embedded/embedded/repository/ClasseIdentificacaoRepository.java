package com.embedded.embedded.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.embedded.embedded.model.Identificacao;

public interface  ClasseIdentificacaoRepository extends JpaRepository<Identificacao, Long> {
    
}
