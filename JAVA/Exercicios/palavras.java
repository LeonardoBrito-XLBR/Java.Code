package Exercicios;

import java.util.Scanner;

public class palavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua palavra: ");

        String palavra = sc.next();

        System.out.print("Digite sua palavra: ");

        String segunda_palavra = sc.next();

        System.out.println(palavra+segunda_palavra);

        sc.close();

    }
}
