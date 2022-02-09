package com.github.brunocs1991.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descricao;

    private static Perfil toEnum(Integer cod){
        if(Objects.isNull(cod)){
            return  null;
        }
        for(Perfil p: Perfil.values()){
            if(cod.equals(p.getCodigo())){
                return p;
            }
        }
        throw new IllegalArgumentException("Perfil inválido");
    }
}
