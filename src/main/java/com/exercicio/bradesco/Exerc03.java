package com.exercicio.bradesco;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double saldoInicial = scn.nextDouble();
        double saldoFinal = 0.00;
        double sum = 0.00;

        for(int i = 0; i < 3; i++) {

            double saldo = scn.nextDouble();
            sum += saldo;
        }
            saldoFinal = saldoInicial + sum;

        System.out.println("Calculo da soma dos valores depositado: " + saldoFinal);
    }
}