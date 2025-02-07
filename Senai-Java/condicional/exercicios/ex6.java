package condicional.exercicios;

import java.util.Scanner;

public class ex6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua 1º nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a sua 2º nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Você possui "+nota1+ " e "+nota2+" resultando na media "+media);

        if (media >= 7){
            System.out.println("VOCE ESTA APROVADO");

        }else{
            System.out.println("VOCE ESTA REPROVADO");

        }

    }
}