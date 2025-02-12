package ex01;

import java.util.Scanner;

public class empalagem {

    // O usuário poderá escolher entre três opções: caixa de papelão, sacola plástica e embalagem de vidro. O programa deve exibir uma breve descrição da embalagem escolhida. O menu deve se repetir até que o usuário selecione a opção de sair.


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);


        int opcao = 0;


        while (opcao != 4) {
            
            System.out.println("\n=== SEJA BEM VINDO AO MENU ===");
            System.out.println("1- CAIXA DE PAPELÃO");
            System.out.println("2- SACOLA PLASTICA");
            System.out.println("3- EMBALAGEM DE VIDRO");
            System.out.println("4- SAIR\n");

            System.out.print("DIGITE A SUA OPCAO: ");   
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento");
                    break;
                    
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
                    break;
                    
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável");
                    break;
                    
                
                case 4:
                System.out.println("Encerrando programa...");
                    break;
                default:
                    break;
            }

        }

    sc.close();

        
    }
}