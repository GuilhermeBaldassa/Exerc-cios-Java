package com.guilherme;

import java.util.Scanner;

// Faça um programa que peça a temperatura em graus Celsius e transforme e mostre em graus Farenheit
// Fórmula - C = (5*(F-32)/9)
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();

        double farenheit = (celsius*1.8)+32;

        System.out.println("A conversão de Celsius para Farenheit é: " + farenheit + "°F");

    }
}
