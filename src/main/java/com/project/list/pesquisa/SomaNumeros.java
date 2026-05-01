package com.project.list.pesquisa;

import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
public class SomaNumeros {

    private List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new IllegalStateException("A lista de números está vazia.");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
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
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(15);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());

        System.out.println("Números na lista:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
