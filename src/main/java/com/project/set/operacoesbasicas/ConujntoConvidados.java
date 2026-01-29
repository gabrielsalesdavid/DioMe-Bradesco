package com.project.set.operacoesbasicas;

import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet;

@NoArgsConstructor
public class ConujntoConvidados {

    private Set<Convidado> convidados;

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidados.isEmpty()) {
            for (Convidado c : convidados) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }

            convidados.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        if (!convidados.isEmpty()) {
            System.err.println(convidados);
        } else {
            System.err.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConujntoConvidados conujntoConvidados = new ConujntoConvidados();

        System.out.println("Existem " + conujntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conujntoConvidados.adicionarConvidado("Alice", 1234);
        conujntoConvidados.adicionarConvidado("Bob", 1235);
        conujntoConvidados.adicionarConvidado("Charlie", 1235);
        conujntoConvidados.adicionarConvidado("David", 1236);

        System.out.println("Convidados no conjunto:");
        conujntoConvidados.exibirConvidados();

        System.out.println("Existem " + conujntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conujntoConvidados.removerConvidadoPorCodigo(1236);
        System.out.println("Existem " + conujntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        System.out.println("Convidado(s) no conjunto após a remoção:");
        conujntoConvidados.exibirConvidados();
    }
}
