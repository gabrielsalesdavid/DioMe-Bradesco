package com.project.list.ordenacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.Comparator;

@AllArgsConstructor
@Getter
@ToString(callSuper = true)
public class Pessoa implements Comparable<Pessoa> {

    private String name;
    private int idade;
    private double altura;

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
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

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
