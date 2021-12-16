package com.guilherme;

import java.util.Scanner;

//Faça um programa que pergunte o quanto vc ganha por hora,e o numero de horas trabalhada no mês,
//Calcule o mostre o total do seu salario,sabendo que são descontados 11% para imposto de renda, 8% para INSS,
//e 5% para o sindicato. Mostre:
//a- Salário Bruto;
//b- Quanto pagou ao INSS;
//c- Quanto pago ao sindicato;
//d- Calcule o desconto e o salário líquido
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora trabalhada? ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        int qtdHoras = scan.nextInt();

        double salario = valorHora * qtdHoras;

        System.out.println("Seu salário bruto é de: R$" + salario);

        double inss = (salario*8)/100;
        System.out.println("O valor de desconto de 8% de INSS é de: RS" + inss);

        double ir = (salario*11)/100;
        System.out.println("O valor de desconto de 11% de IR é de: R$" + ir);

        double sindicato = (salario*5)/100;
        System.out.println("O valor de desconto de 5% de sindicato é de: R$" + sindicato);

        System.out.println("Seu salário líquido é: R$" + (salario-inss-ir-sindicato));

    }
}
