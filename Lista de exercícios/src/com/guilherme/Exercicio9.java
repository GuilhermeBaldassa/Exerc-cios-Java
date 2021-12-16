package com.guilherme;


// Faça um programa que peça a temperatura em graus Farenheit e transforme e mostre em graus Célsius
// Fórmula - C = (5*(F-32)/9)

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Graus Farenheit: ");
        double farenheit = scan.nextDouble();

        double Celsius = 5*(farenheit-32)/9;

        System.out.println("A conversão para graus Celsius é: " + Celsius + "°C");

    }
}
