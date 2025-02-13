package ex01;

import java.util.Scanner;

import javax.swing.text.Style;

public class main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao = 0; 
        
        
        while (opcao !=4) {
            
                    System.out.println("=== MENU DAS CANETAS ===");
                    System.out.println("1- MOCHILA ESCOLAR");
                    System.out.println("2- MOCHILA DE VIAGEM");
                    System.out.println("3- MOCHILA ESPORTIVA");
                    System.out.println("4- PARA SAIR DO PROGRAMA!");
            
                    System.out.print("\nDigite a opção desejada: ");
                    opcao = sc.nextInt();


                    switch (opcao) {
                        case 1:
                            System.out.println("Mochila Escolar: Compacta e ideal para estudantes ");
                            break;
                    
                        case 2:
                            System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas ");
                            break;
            
                        case 3: 
                            System.out.println("Mochila Esportiva: Leve, resistente e ergonômica ");
                            break;
            
                        case 4:
                            System.out.println("Encerra saindo do programa...");
                            break;
                    
                        default:
                            break;
                    }
                }





        
    }
}

