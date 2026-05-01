package com.project.list.operacoesbasicas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString(callSuper = true)
public class Item {

    private String nome;
    private Double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Item{"
                + "nome='" + nome + '\''
                + ", preco=" + preco
                + ", quantidade=" + quantidade
                + '}';
    }
}
