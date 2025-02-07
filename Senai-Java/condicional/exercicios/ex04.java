package condicional.exercicios;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "XXXAAA";

        System.out.print("Digite asua senha: ");
        String passwordNew = sc.next();

        if (passwordNew.equals(password)){
            System.out.println("Bem Vindo ao Planeta");

        } else {
            System.out.println("ERRO EM LER A SENHA");
        }

    }
}