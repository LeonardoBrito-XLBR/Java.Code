package exercicios2;

import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class ex00 {

    public static void main(String[] args) {
    
        //BIBLIOTECA DE SCANNEAR
        Scanner sc = new Scanner(System.in);

        // VARIAVEL DE ANALISE DE NUMEROS
        String parar = "G";
        String analise = "";
        boolean loop = false; //VARIAVEL FREIO DO LOOP

        //LOOP COM WHILE
        while (true) {

            //FORMA DE ENCERRAR O PROGRAMA
            
            //SOLICITANDO O NUMERO
            System.out.print("Digite um numero: ");
            float num = sc.nextFloat();
            
            //ANALISANDO CADA NUMERO
            if (num > 0 ){
                analise = "O NUMERO É POSITIVO";
            } else if (num < 0){
                analise = "O NUMERO É NEGATIVO";
                
            } else {
                System.out.println("O NUMERO DIGITADO É NULO");
            }

            System.out.println("O SEU "+num+ " é: "+analise);
            
            //ANALISANDO A BREAK DO LOOP 
            System.out.println("DIGITE (G) para encerrar o programa");
            String resposta = sc.next();
            
            if (resposta.contains(parar)){
                return;
            }
            
            
        }
        

        //CONDICOES DE POSITIVO 

    }
}
