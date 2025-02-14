package Ex;


// Escreva um programa que leia um vetor de números
// inteiros e exiba a média dos elementos.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //IMPORTA A BIBLIOTECA DE LEITURA
        Scanner  sc = new Scanner(System.in);

        System.out.print("Quantos numeros vc quer adicionar: ");
        int largura = sc.nextInt();

        //PRE-DEFININDO O ARRAY
        double numeros [] = new double [largura];

        // PREENCHER O VETOR COM A QUANTIDADE DESEJADA
        for (int num = 0 ; num < numeros.length; num++) {

            //ATIVANDO O LOOP COM A VARIAVEL (num) 
            System.out.print ("DIGITE O SEU" + (num+=1) + "NUMERO: ");
            //ADCIONANDO OS NUMEROS NA POSIÇÃO NA LISTA
            numeros[num] = sc.nextDouble();
        }

        for (double d : numeros) {
            System.err.println(d);
        }


    }
}
