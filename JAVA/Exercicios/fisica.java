package Exercicios;

import java.util.Scanner;

import funcao.calculadora;

public class fisica {
    /* FORMULA DA FISICA
     * T = F * D
     */
    public static void main(String[] args) {

        //IMPORTANDO A FUNCAO DE CALCULDORA
        calculadora calc = new calculadora();
        
        //IMPORTANDO A FUNCAO DE LEITURA
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a Forca: ");
        double forca = sc.nextDouble();

        System.out.print("Digite a Distancia: ");
        double distancia = sc.nextDouble();

        double T = forca * distancia;
        
        //EXIBINDO O RESULTADO
        System.out.println("O Resultado da sua Trabalho: "+T);

        //USANDO ARQUIVO EXTERNO
        calc.forca(forca, distancia);

        

        sc.close();
    }
}
