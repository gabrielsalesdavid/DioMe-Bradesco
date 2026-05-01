package com.project.set.pesquisa;

@AllArgsConstructor
@Getter
@Setter
public class Tarefa {

    private String descricao;
    private boolean concluida;

    public boolean isConcluida() {
        return concluida;
    }

    public String toString() {
        return "Tarefa {"
                + " descricao = " + descricao + '\''
                + ", concluida = " + concluida
                + '}';
    }
}
