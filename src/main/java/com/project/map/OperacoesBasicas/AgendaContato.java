package com.project.map.OperacoesBasicas;

import java.util.Map;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendaContato {

    private Map<String, Integer> contatos;

    public void adicionarContato(String nome, Integer numero) {
        contatos.put(nome, numero);
    }

    public void removerContato(String nome) {
        if(contatos.isEmpty()) {
            contatos.remove(nome);
        } else {
            throw new IllegalStateException("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if(contatos.isEmpty()) {
            System.out.println("A agenda de contatos está vazia.");
        } else {
            contatos.forEach((nome, numero) -> System.out.println("Nome: " + nome + ", Número: " + numero));
        }
    }

    public Integer pesquisarContato(String nome) {
        if(contatos.containsKey(nome)) {
            return contatos.get(nome);
        } else {
            throw new IllegalArgumentException("Contato não encontrado: " + nome);
        }
    }
}