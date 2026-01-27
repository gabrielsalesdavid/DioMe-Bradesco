package com.project.list.ordenacao;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoaList.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(essoaList);
        if (!pessoasPorIdade.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new IllegalStateException("A lista de pessoas está vazia. Não é possível ordenar por idade.");
        }
    }

    public List<Pessoa> ordenacaoPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoasPorAltura.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new IllegalStateException("A lista de pessoas está vazia. Não é possível ordenar por altura.");
        }
    }

    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Carlos", 30, 1.75);
        ordenacaoPessoa.adicionarPessoa("Ana", 25, 1.65);
        ordenacaoPessoa.adicionarPessoa("Beatriz", 28, 1.70);

        System.out.println("Pessoas ordenadas por idade:");
        List<Pessoa> pessoasOrdenadasPorIdade = ordenacaoPessoa.ordenarPorIdade();
        for (Pessoa pessoa : pessoasOrdenadasPorIdade) {
            System.out.println(pessoa);
        }

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println(ordenacaoPessoa.ordenacaoPorAltura());
    }
}
