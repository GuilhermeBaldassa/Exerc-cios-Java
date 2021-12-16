package com.guilherme;

import java.util.Scanner;

//Faça um programa que calcule a área de um quadrado e em seguida mostre o dobro pro usuário.

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de um dos lados do quadrado: ");
        double lado1 = scan.nextDouble();
        double areaQuadrado = Math.pow(lado1,2);

        System.out.println("A área do quadro é: " + areaQuadrado);
        System.out.println("E o dobro de sua área é: " + areaQuadrado*2);


    }
}
