package com.project.list.operacoesbasicas;

import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ListaTarefa {

    private List<Tarefa> listTarefa;

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        listTarefa.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : listTarefa) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        listTarefa.removeAll(tarefasParaRemover);
    }

    public int obterQuantidadeTarefas() {
        return listTarefa.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa tarefa : listTarefa) {
            System.out.println(tarefa.getDescricao());
        }
    }
}
