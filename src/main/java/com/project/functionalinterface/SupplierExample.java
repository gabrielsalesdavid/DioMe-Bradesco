package com.project.functionalinterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá, seja bem-vindo ao mundo das interfaces funcionais!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        listaSaudacoes.forEach(System.out::println);
    }
}
