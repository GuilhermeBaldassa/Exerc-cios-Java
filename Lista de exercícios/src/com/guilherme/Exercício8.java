package com.guilherme;


import java.util.Scanner;

//Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhado por mês e calcule o salário.
public class Exercício8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de sua hora trabalhada: ");
        double valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas você trabalha durante o mês: ");
        int horaMes = scan.nextInt();

        System.out.println("Seu salário mensal é de: R$" + (valorHora*horaMes));

    }
}
