package Exercicios;

import java.util.Scanner;

import funcao.calculadora;

public class operadores {
    public static void main(String[] args) {
        calculadora calc = new calculadora();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o seu numero: ");
        double n2 = sc.nextDouble();

        double soma = n2 + n1;
        double substracao = n1 - n2;
        double divisao = n1 / n2;
        double multiplacao = n1 * n2;

    
        System.out.println("Seu resultado da soma é: "+soma);
        System.out.println("Seu resultado da substracao é: "+substracao);
        System.out.println("Seu resulatdo da divisao é: "+divisao);
        System.out.println("Seu resulrtado da multiplicacao é: "+multiplacao);


        calc.somar(n1, n2);
        calc.subt(n1, n2);
        calc.divi(n1, n2);
        calc.mult(n1, n2);
        sc.close();
    }
}
