package com.project.list.ordenacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.Comparator;

@AllArgsConstructor
@Getter
@ToString(callSuper = true)
public class Pessoa {

    private String name;
    private int idade;
    private double altura;

    @Override
    public int compareTo(Pessoa p) {
        return this.name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Pessoa{"
                + "name='" + name + '\''
                + ", idade=" + idade
                + ", altura=" + altura
                + '}';
    }
}
