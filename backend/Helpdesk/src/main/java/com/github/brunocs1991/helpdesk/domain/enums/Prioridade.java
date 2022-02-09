package com.github.brunocs1991.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum Prioridade {
    BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

    private Integer codigo;
    private String descricao;

    private static Prioridade toEnum(Integer cod){
        if(Objects.isNull(cod)){
            return  null;
        }
        for(Prioridade p: Prioridade.values()){
            if(cod.equals(p.getCodigo())){
                return p;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");
    }
}
