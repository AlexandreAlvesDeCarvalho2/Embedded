package com.embedded.embedded.model;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Identificacao {

    @EmbeddedId
    private IdentificacaoId identificacaoId = new IdentificacaoId();

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("oneId")
    @JoinColumn(name = "one_Id")
    private Classeone classeone;
    
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("twoId")
    @JoinColumn(name = "two_Id")
    private Classetwo classetwo;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("treeId")
    @JoinColumn(name = "tree_Id")
    private Classetree classetree;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("fourId")
    @JoinColumn(name = "four_Id")
    private Classefour classefour;

    private String nome;

}
