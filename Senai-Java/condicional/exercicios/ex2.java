package condicional.exercicios;

import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua 1º nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Você possui "+nota1+ " resultando na media ");

        if (nota1 >= 7){
            System.out.println("VOCE ESTA APROVADO");

        }else{
            System.out.println("VOCE ESTA REPROVADO");

        }

    }
}