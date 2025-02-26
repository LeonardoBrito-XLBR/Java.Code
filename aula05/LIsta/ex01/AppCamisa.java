package LIsta.ex01;

import java.util.ArrayList;
import java.util.Scanner;


public class AppCamisa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Camisa> roupas  = new ArrayList<>();
        
    

        while (true) {

            // EXIBINDO MENU DE COMANDOS 
            menuComandos();
            
            System.out.print("Digite a sua opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("DIGITE A COR DA CAMISA: ");
                    String corUsu = scan.nextLine();

                    System.out.println("DIGITE A TAMANHO DA CAMISA: ");
                    int tamanhoUsu = scan.nextInt();

                    System.out.println("DIGITE O TIPO DA CAMISA: ");
                    String tipoUsu = scan.nextLine();
                
                    roupas.add(new Camisa(corUsu, tamanhoUsu, tipoUsu));
                    break;
            
                case 2:

                break
                default:
                    break;
            }
        }
    

      
        
        // roupas.add(new Camisa());
        // Camisa roupa = new Camisa("amarelo", 47, "camiseta");

        // roupas.add(roupa);
        




        //ACESSANDO CADA ITEM NO OBJETO
        // System.out.println(roupa.getCor());
        // System.out.println(roupa.getTamanho());
        // System.out.println(roupa.getTipo());

        //SOLICITANDO CADA NOVO ITEM PARA USUAURIO


        scan.close();
    }



    public static void menuComandos() {

        System.out.println();
        System.out.println("===== MENU DE COMANDOS =====");
        System.out.println("1- PARA ADICIONAR UMA NOVA CAMISA");
        System.out.println("2- PARA VER TOTAL DE CAMISA ");
        System.out.println("3- ALTERAR UMA CAMISA");
        System.out.println("4- REMOVER UMA CAMISA");
        System.out.println("5- ENCERRAR O PROGRAMA");
        System.out.println();
    }


}
