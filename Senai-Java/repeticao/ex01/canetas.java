package ex01;

import java.util.Scanner;

import javax.swing.text.Style;

public class main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao = 0; 
        
        
        while (opcao !=4) {
            
                    System.out.println("=== MENU DAS CANETAS ===");
                    System.out.println("1- CANETA ESFEROGRÁFICA");
                    System.out.println("2- CANETA GEL");
                    System.out.println("3- CANETA TINTEIRO");
                    System.out.println("4- PARA SAIR DO PROGRAMA!");
            
                    System.out.print("\nDigite a opção desejada: ");
                    opcao = sc.nextInt();


                    switch (opcao) {
                        case 1:
                            System.out.println("Caneta Esferográfica: Econômica e de longa duração ");
                            break;
                    
                        case 2:
                            System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave ");
                            break;
            
                        case 3: 
                            System.out.println("Caneta Tinteiro: Econômica e de longa duração ");
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

