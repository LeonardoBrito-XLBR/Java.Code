package Exercicios;

import java.util.Scanner;

import funcao.calculadora;

public class media {
    public static void main(String[] args) {

        //BIBLIOTECA PARA SCANEAR
        Scanner sc = new Scanner(System.in);
        
        //CHAMANDO A FUNCAO EXTERNA
        calculadora calc = new calculadora();

        System.out.print("Digite seu numero: ");

        double n1 = sc.nextDouble();
        System.out.print("Digite seu numero: ");

        double n2 = sc.nextDouble();


        //MANDANDO PARA O FUNCAO EXTERNA
        calc.media_two(n1, n2);


        double media = (n1+n2)/2;

        System.out.println("Sua media é igual: "+media);
        sc.close();
    }
}
