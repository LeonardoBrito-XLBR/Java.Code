package exercicios2;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
    
        //BIBLIOTECA DE SCANNEAR
        Scanner sc = new Scanner(System.in);

        // VARIAVEL DE ANALISE DE NUMEROS
        String analise;

        System.out.println("Digite um numero: ");
        double num = sc.nextDouble();

        //CONDICOES DE POSITIVO 
        if (num > 0 ){
            analise = "O NUMERO É POSITIVO";
        } else if (num < 0){
            analise = "O NUMERO É NEGATIVO";
            
        } else {
            System.out.println("O NUMERO DIGITADO É NULO");
        }

        sc.close();
    }
}
