package com.guilherme;

//Faça um programa que peça 2 números inteiros, e um número real, calcule e mostre:
//a- o produto do dobro do primeiro com metade do segundo;
//b- a soma do triplo do primeiro com o terceiro;
//c- o terceiro elevado ao cubo.

import java.util.Scanner;

import static java.lang.Math.pow;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Digite o segundo número inteiro: ");
        double segundoNumero = scan.nextDouble();

        System.out.println("Digite o terceiro número real: ");
        double terceiroNumero = scan.nextDouble();

        double calculo1 = (primeiroNumero*2)*(segundoNumero/2);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: "+ calculo1);

        double calculo2 = (primeiroNumero*3) + (terceiroNumero);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + calculo2);

        System.out.println("O terceiro elevado ao cubo é: " + Math.pow(terceiroNumero,3));


    }
}
