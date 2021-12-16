package com.guilherme;
//Faça um programa que peça o tamanho de um arquivo de download em MB, e a velocidade de um link de internet em Mbps,
//calcule e informe o tempo aproximado em minutos.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade de download em Mbps:");
        double velocidadeMbps = scan.nextDouble();

        Double velocidadeDownload = (tamanhoArquivo/velocidadeMbps)/60;
        System.out.println("O download será concluído em:" + velocidadeDownload + "min.");
    }
}
