package com.guilherme;

import java.util.Scanner;

// Peça para digitar um número e imprima na tela: "O número digitado foi: ...
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("O número digitado foi: " + numero + ".");
    }
}
