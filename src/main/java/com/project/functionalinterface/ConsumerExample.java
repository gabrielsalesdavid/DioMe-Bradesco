package com.project.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<Integer> imprimirNumero = numero -> {
            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
        };

        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(imprimirNumero);
    }
}
