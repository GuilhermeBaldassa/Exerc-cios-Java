package com.guilherme;

import java.util.Scanner;

//Faça um programa que converta metros para centrímetros
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor em metros: ");
        double valorMetros = scan.nextDouble();

        System.out.println("O valor digitado em métros equivale a: " + valorMetros*100 + "cm.");
    }
}
