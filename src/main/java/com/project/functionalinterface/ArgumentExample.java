package com.project.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArgumentExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Function<Integer, Integer> quadrado = numero -> numero * numero;

        List<Integer> numerosQuadrados = numeros.stream()
                .map(quadrado)
                .collect(Collectors.toList());

        numerosQuadrados.forEach(System.out::println);
    }
}
