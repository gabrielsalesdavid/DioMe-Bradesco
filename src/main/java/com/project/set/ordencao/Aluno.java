package com.project.set.ordencao;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;
import java.util.Objects;

@AllArgsConstructor
@Getter
public class Aluno {

    private String nome;
    private Long matricula;
    private double media;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Aluno aluno)) {
            return false;
        }
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hasCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public String toString() {

        return "Aluno{"
                + "nome = '" + nome + '\''
                + ", matricula = " + matricula
                + ", media = " + media
                + '}';
    }
}

class ComparatorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
