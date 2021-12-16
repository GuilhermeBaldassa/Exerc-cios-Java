package com.guilherme;


//Faça um programa que peça 2 números e imprima a soma na tela.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scan.nextInt();

        System.out.println("A soma dos dois número é: " + (primeiroNumero + segundoNumero));
    }
}
