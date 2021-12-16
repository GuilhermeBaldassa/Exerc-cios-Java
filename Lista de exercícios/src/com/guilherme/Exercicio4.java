package com.guilherme;

//Faça um programa que peça 4 notas e mostre a média.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        Double nota3 = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        Double nota4 = scan.nextDouble();

        System.out.println("A média das quatro notas é: " + (nota1+nota2+nota3+nota4)/4);


    }
}
