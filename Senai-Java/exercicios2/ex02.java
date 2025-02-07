package exercicios2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //GUARDANDO O RESULTADO DA ANALISE
        String analise = "";
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12){
            analise = "criança";

        } else if (idade >= 13 && idade <= 17){
            analise = "adolescente";
        
        } else if (idade >=18 && idade <= 59){
            analise = "adulto";
        
        } else if (idade >= 60 ){
            analise = "idoso";

        } else {
            analise = "você esta morto";
        }

        System.out.println("Com esses "+idade+ " vc esta "+analise);

    }
}
