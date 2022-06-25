package com.embedded.embedded.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Classefour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classeId;
    private String fourName;

    @JsonManagedReference
    @OneToMany(mappedBy = "classefour", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Identificacao> identificacao = new ArrayList<>();

    
}