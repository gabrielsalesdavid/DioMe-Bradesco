package com.project.list.ordenacao;

import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class OrdenacaoNumeros {

    private List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList(this.numeros);
        if (!numerosAscendente.isEmpty()) {
            numerosAscendente.sort(Integer::compareTo);
            return numerosAscendente;
        } else {
            throw new IllegalStateException("A lista de números está vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if (!numerosAscendente.isEmpty()) {
            numerosAscendente.sort((n1, n2) -> n2.compareTo(n1));
            return numerosAscendente;
        } else {
            throw new IllegalStateException("A lista de números está vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                System.out.println(numero);
            }
        } else {
            throw new IllegalStateException("A lista de números está vazia.");
        }
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(9);

        System.out.println("Números adicionados:");
        ordenacaoNumeros.exibirNumeros();

        System.out.println("\nNúmeros em ordem ascendente:");
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println("\nNúmeros em ordem descendente:");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
