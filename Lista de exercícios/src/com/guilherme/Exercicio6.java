package com.guilherme;

import java.util.Scanner;

//Faça um programa que peça um raio de um círculo e calcule e mostre sua área.
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio de um Círculo em cm: ");
        double raio = scan.nextDouble();

        System.out.println("A área do círculo é: " + 3.14 * Math.pow(raio,2) + "cm.");

    }
}
