package Exercicios;

import java.util.Scanner;

import funcao.calculadora;

public class IMC {
    public static void main(String[] args) {
        //CHAMANDO A LEITURA
        Scanner sc = new Scanner(System.in);
        //CHAMANDO A CALCULADORA
        calculadora calc = new calculadora();


        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double resultado = peso / (altura*altura);
        System.out.printf("O seu resultado foi %.2f do seu teste de IMC",resultado);
        

        calc.IMC(peso, altura);

        sc.close();
    }
}
