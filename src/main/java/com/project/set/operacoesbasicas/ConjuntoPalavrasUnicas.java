package com.project.set.operacoesbasicas;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public void adicionarPalavras(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                System.out.println("A palavra '" + palavra + "' já existe no conjunto.");
            } else {
                palavrasUnicas.add(palavra);
                System.out.println("Palavra '" + palavra + "' adicionada com sucesso.");
            }
        } else {
            palavrasUnicas = new HashSet<>();
            palavrasUnicas.add(palavra);
            System.out.println("Palavra '" + palavra + "' adicionada com sucesso.");
        }
    }

    public boolean verificarPalavras(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("O conjunto de palavras únicas está vazio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavras("Java");
        conjunto.adicionarPalavras("Python");
        conjunto.adicionarPalavras("Java"); // Tentativa de adicionar palavra duplicada

        System.out.println("Verificar se 'Python' existe: " + conjunto.verificarPalavras("Python"));
        System.out.println("Verificar se 'C++' existe: " + conjunto.verificarPalavras("C++"));

        conjunto.exibirPalavrasUnicas();
        conjunto.removerPalavra("Python");
        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("C++"); // Tentativa de remover palavra inexistente

        System.out.println("A linguagem 'Java' está no conjunto? " + conjunto.verificarPalavras("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjunto.verificarPalavras("Python"));

        conjunto.exibirPalavrasUnicas();
    }
}
