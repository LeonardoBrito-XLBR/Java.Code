

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
            String opcao = scan.nextLine();

            switch (opcao) {

                case "1": 
                    //SOLICITANDO DADOS PARA USUARIO
                    System.out.print("DIGITE A COR DA CAMISA: ");
                    String corUsu = scan.nextLine();

                    System.out.print("DIGITE A TAMANHO DA CAMISA: ");
                    int tamanhoUsu = scan.nextInt();
                    scan.nextLine();

                    System.out.print("DIGITE O TIPO DA CAMISA: ");
                    String tipoUsu = scan.nextLine();


                    //ADICIONADO UM OBJETO DIRETAMENTE NO ARRAY 
                    roupas.add(new Camisa(corUsu, tamanhoUsu, tipoUsu));
                    System.out.println("Camisas cadastradas com sucesso!");
                    break;

            
                case "2":
                    int i = 0;


                    if (roupas.size() == 0){
                        System.out.println("GUARDA-ROUPA ESTA VAZIO! PRIMEIRO CADASTRE UMA PEÇA PARA EXCLUIR");
                        break;
                    }
                    
                    //IMPRIMINDO TODAS AS CAMISAS 
                    for (Camisa camisa : roupas) {
                        System.out.println("[" +(i++) +"] CAMISA DE COR: "+ camisa.getCor() + " - " + "CAMISA DE TAMANHO: " + camisa.getTamanho() + " - "+ "CAMISA DE TIPO: "+camisa.getTipo());
                    }
                    break;

                case "3":
                    //SOLICITANDO A POSICAO DA CAMISA NO ARRAY QUE O USU DESEJA MUDAR
                    System.out.print("DIGITE A POSCICAO DA CAMISA QUE VC QUER ALTERAR: ");
                    int posicaoIndex = scan.nextInt();
                    scan.nextLine();
                    
                    //TRAZENDO EM UMA VARIAVEL O OBJETO NO ARRAY 
                    Camisa camisa = roupas.get(posicaoIndex);


                    // === ALTERAÇÃO NA COR DAS CAMISAS  ===
                    System.out.println("A CAMISA SELECIONADA POSSUI ESSA COR: "+camisa.getCor());
                    System.out.print("DIGITE A NOVA COR (OU PRESSIONE ENTER PARA PULAR): ");
                    String novaCor = scan.nextLine();

                    //VERIFICANDO SE VALOR DA CAMISA FOI DIGITADO - ALTERANDO O VALOR
                    if (!novaCor.isEmpty()) camisa.setCor(novaCor);
                    

                
            
                    System.out.println("A CAMISA SELECIONADA POSSUI ESSE TAMANHO: "+camisa.getTamanho());
                    System.out.print("DIGITE O NOVO TAMANHO (OU PRESSIONE ENTER PARA PULAR): ");
                    String novaTamanhoStr = scan.nextLine();

            
                        // ======== RESOLVER ESSA TIPAGEM VIU ========
                    if (!novaTamanhoStr.isEmpty()){
                        int novoTamanho = Integer.parseInt(novaTamanhoStr);
                        camisa.setTamanho(novoTamanho);
                    } 
                    
                        

            
                    System.out.println("A CAMISA SELECIONADA TEM ESSE TIPO: "+camisa.getTipo());
                    System.out.print("DIGITE O NOVO TIPO (OU PRESSIONE ENTER PARA PULAR): ");
                    String novoTipo = scan.nextLine();

            
                    if (!novoTipo.isEmpty()) camisa.setTipo(novoTipo);
                    
                    break;



                case "4":
                    
                    //REMOVENDO CAMISAS DE ACORDO COM A POSIÇÃO NO ARRAY
                
                    if (roupas.size() == 0){
                        System.out.println("GUARDA-ROUPA ESTA VAZIO! PRIMEIRO CADASTRE UMA PEÇA PARA EXCLUIR");
                        break;
                    }
                    
                    System.out.println("SUGERIMOS QUE VC VERIFIQUE ANTES DE APAGAR UM ITEM NA LISTA, CERTO?");
                    System.out.print("DIGITE A POSICAO DA CAMISA A SER ALTERADA (0- "+(roupas.size()-1)+"): ");
                    int posicaoRemover = scan.nextInt();
                    roupas.remove(posicaoRemover);
                        
                    
                

                    System.out.println("CAMISA REMOVIDA COM SUCESSO! ");
                    break;


                case "5":
                    //ENCERRANDO O PROGRAMA...
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
