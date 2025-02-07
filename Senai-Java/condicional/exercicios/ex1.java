package condicional.exercicios;

import java.util.Scanner;

class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String status;

        System.out.print("Digite o seu salario: ");
        int salario = sc.nextInt();

        if (salario >= 30000){
            status = "Rico";

        } else {
            status = "Pobre";
        }

        System.out.print("O seu status é "+status+" de acordo com seu salario");
        
        sc.close();
    }
}