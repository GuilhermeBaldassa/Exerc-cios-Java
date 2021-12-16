package com.guilherme;

//Tendo como dados a entrada de altura de uma pessoa, construa um algorítimo que calcule seu peso ideal usando:
//Fórmula(72,7^altura)-58

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua altura em metros: ");
        double altura = scan.nextDouble();

        double pesoIdeal = Math.pow(72.7,altura)-58;
        System.out.println("Seu peso ideal é de: " + pesoIdeal + "Kg.");



    }
}
