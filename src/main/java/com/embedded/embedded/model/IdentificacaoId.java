package com.embedded.embedded.model;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Embeddable
public class IdentificacaoId implements Serializable{

    private Long oneId;
    private Long twoId;
    private Long treeId;
    private Long fourId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdentificacaoId)) return false;
        IdentificacaoId indentificacao = (IdentificacaoId) o;
        return Objects.equals(getOneId(), indentificacao.getOneId()) &&
                Objects.equals(getTwoId(), indentificacao.getTwoId()) &&
                Objects.equals(getTreeId(), indentificacao.getTreeId()) &&
                Objects.equals(getFourId(), indentificacao.getFourId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOneId(), getTwoId(), getTreeId(), getFourId());
    }
}