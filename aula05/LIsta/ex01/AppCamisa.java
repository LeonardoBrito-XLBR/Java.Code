

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
            scan.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("DIGITE A COR DA CAMISA: ");
                    String corUsu = scan.nextLine();

                    System.out.print("DIGITE A TAMANHO DA CAMISA: ");
                    int tamanhoUsu = scan.nextInt();
                    scan.nextLine();

                    System.out.print("DIGITE O TIPO DA CAMISA: ");
                    String tipoUsu = scan.nextLine();

                    roupas.add(new Camisa(corUsu, tamanhoUsu, tipoUsu));
                    System.out.println("Camisas cadastradas com sucesso!");
                    break;
            
                case 2:

                    //IMPRIENDO TODAS AS CAMISAS 
                    int i = 0;
                    for (Camisa camisa : roupas) {

                        System.out.println("[" +(i++) +"] CAMISA DE COR: "+ camisa.getCor() + " - " + "CAMISA DE TAMANHO: " + camisa.getTamanho() + " - "+ "CAMISA DE TIPO: "+camisa.getTipo());
                    
                    }
                    break;

                case 4:
                    System.out.print("DIGITE A POSICAO DA CAMISA A SER ALTERADA (0-inicio): ");
                    int posicaoRemover = scan.nextInt();
                    roupas.remove(posicaoRemover);
                    break;


                case 5:
                    System.out.println("SAINDO DO PROGRAMA... OBRIGADO PELO TEST");
                    return;

                default:
                    System.out.println("OPCAO INVALIDA - REVEJA O MENU");
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
