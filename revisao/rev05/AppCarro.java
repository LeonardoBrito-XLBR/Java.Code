<<<<<<< HEAD

import java.util.ArrayList;
import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Carro> conjCarros = new ArrayList<>();

        while (true){
            menuComando();
            System.out.print("DIGITE A SUA OPCAO: ");
            String opcaoStr = scan.next();
            int opcao = Integer.parseInt(opcaoStr);



            switch (opcao) {
                case 1:


                    /*  CODIGO PRINCIPAL 
                    
                    System.out.print("DIGITE A MARCA DO SEU CARRO: ");
                    String marca = scan.nextLine();
                    scan.nextLine();

                    System.out.print("DIGITE O MODELO DO SEU CARRO: ");
                    String modelo = scan.nextLine();

                    System.out.print("DIGITE O ANO DO SEU CARRO: ");
                    int ano = scan.nextInt();
                    scan.nextLine();
                
                    System.out.println(); // PULANDO LINHA 

                    Carro veiculo = new Carro(marca, modelo, ano);  
                    conjCarros.add(veiculo); */

                    conjCarros.add(new Carro("FIAT", "OFF-ROAD", 2024));
                    conjCarros.add(new Carro("Toyota", "Corolla", 2021));
                    conjCarros.add(new Carro("Honda", "Civic", 2020));
                    conjCarros.add(new Carro("BMW", "X5", 2023));
                    conjCarros.add(new Carro("Ford", "Mustang", 2022));
                    conjCarros.add(new Carro("Chevrolet", "Cruze", 2019));
                    conjCarros.add(new Carro("Audi", "A4", 2021));
                    conjCarros.add(new Carro("Volkswagen", "Golf", 2020));
                    conjCarros.add(new Carro("Mercedes-Benz", "C-Class", 2022));
                    conjCarros.add(new Carro("Hyundai", "Tucson", 2023));


                    System.out.println("CARRO CADASTRADO COM SUCESSO!");
                break;
                

                case 2:
                    int i = 0;

                    if (conjCarros.isEmpty()){
                        System.out.println("NENHUM CARRO NA GARAGEM! PFV PREENCHA COM ALGUM VEICULO");
                        break;
                    }

                    for (Carro carro : conjCarros) {
                        System.out.println("[" +(i++)+ "] CARRO DE MARCA: "+carro.getMarca()+ " - CARRO DE MODELO: " +carro.getModelo()+ " - CARRO DE ANO:  "+carro.getAno());
                    }

                    break;

                    case 3:
                        System.out.print("DIGITE QUAL CARRO VC QUER ALTERAR (ÍNDICE): ");
                        int posicaoIndex = scan.nextInt();
                        scan.nextLine(); // Consome a quebra de linha pendente
                    
                        // Verifica se o índice existe na lista
                        if (posicaoIndex < 0 || posicaoIndex >= conjCarros.size()) {
                            System.out.println("ÍNDICE INVÁLIDO!");
                            break;
                        }
                    
                        Carro carro = conjCarros.get(posicaoIndex);
                    
                        // ALTERAÇÃO DA MARCA
                        System.out.println("O CARRO POSSUI ESSA MARCA: " + carro.getMarca());
                        System.out.print("DIGITE A NOVA MARCA DO CARRO (PRESSIONE ENTER PARA PULAR):    ");
                        String novaMarca = scan.nextLine();
                        if (!novaMarca.isEmpty()) carro.setMarca(novaMarca);
                    
                        // ALTERAÇÃO DO MODELO
                        System.out.println("O CARRO POSSUI ESSE MODELO: " + carro.getModelo());
                        System.out.print("DIGITE O NOVO MODELO DO CARRO (PRESSIONE ENTER PARA PULAR):   ");
                        String novoModelo = scan.nextLine();
                        
                        if (!novoModelo.isEmpty()) carro.setModelo(novoModelo);
                    
                        // ALTERAÇÃO DO ANO DE FABRICAÇÃO
                        System.out.println("O CARRO POSSUI ESSE ANO DE FABRICAÇÃO: " + carro.getAno());
                        System.out.print("DIGITE O NOVO ANO DO CARRO (PRESSIONE ENTER PARA PULAR): ");
                        String entradaAno = scan.nextLine(); // Lendo como String para permitir ENTER   sem erro
                        if (!entradaAno.isEmpty()) {
                        try {
                            int novoAno = Integer.parseInt(entradaAno);
                            carro.setAno(novoAno);
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida para o ano! Mantendo o valor original.");
                        }
                    }
                    
                    System.out.println("\nCARRO ATUALIZADO COM SUCESSO!");
                    break;
                

                case 4:
                    System.out.println("AVISO, OLHE A LISTA ANTES DE QUALQUER EXCLUSAO");
                    System.out.print("DIGITE QUAL CARRO VC QUER EXCLUIR (INDEX): ");

                    
                    int indexRemover = scan.nextInt();

                    if (indexRemover < 0 || indexRemover >= conjCarros.size()) {
                        System.out.println("ÍNDICE INVÁLIDO!");
                        break;
                    }
                    conjCarros.remove(indexRemover);

                    System.out.println("CARRO REMOVIDO COM SUCESSO!");
                    break;

                case 5:
                    System.out.println("Saindo do programa! OBRIGADO");
                    return;
                    

                default:
                    System.out.println("OPCAO INVALIDA DO SISTEMA");
                    break;
            }

            
        }
        // Carro veiculo = new Carro("FIAT", "OFF-ROAD", 2025);
    }

    public static void menuComando(){
        System.out.println();
        System.out.println("====== MENU DE COMANDOS DA GARAGEM ======");
        System.out.println("1- ADICIONAR CARROS A GARAGEM");
        System.out.println("2- VISUALIZAR TODOS OS CARROS ");
        System.out.println("3- ALTERAR DADOS DOS CARROS");
        System.out.println("4- EXCLUIR OS CARROS DA GARAGEM");
        System.out.println("5- SAIR DO PROGRAMA");
        System.out.println();
    } 
=======

import java.util.ArrayList;
import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Carro> conjCarros = new ArrayList<>();

        while (true){
            menuComando();
            System.out.print("DIGITE A SUA OPCAO: ");
            String opcaoStr = scan.next();
            int opcao = Integer.parseInt(opcaoStr);



            switch (opcao) {
                case 1:


                    /*  CODIGO PRINCIPAL 
                    
                    System.out.print("DIGITE A MARCA DO SEU CARRO: ");
                    String marca = scan.nextLine();
                    scan.nextLine();

                    System.out.print("DIGITE O MODELO DO SEU CARRO: ");
                    String modelo = scan.nextLine();

                    System.out.print("DIGITE O ANO DO SEU CARRO: ");
                    int ano = scan.nextInt();
                    scan.nextLine();
                
                    System.out.println(); // PULANDO LINHA 

                    Carro veiculo = new Carro(marca, modelo, ano);  
                    conjCarros.add(veiculo); */

                    conjCarros.add(new Carro("FIAT", "OFF-ROAD", 2024));
                    conjCarros.add(new Carro("Toyota", "Corolla", 2021));
                    conjCarros.add(new Carro("Honda", "Civic", 2020));
                    conjCarros.add(new Carro("BMW", "X5", 2023));
                    conjCarros.add(new Carro("Ford", "Mustang", 2022));
                    conjCarros.add(new Carro("Chevrolet", "Cruze", 2019));
                    conjCarros.add(new Carro("Audi", "A4", 2021));
                    conjCarros.add(new Carro("Volkswagen", "Golf", 2020));
                    conjCarros.add(new Carro("Mercedes-Benz", "C-Class", 2022));
                    conjCarros.add(new Carro("Hyundai", "Tucson", 2023));


                    System.out.println("CARRO CADASTRADO COM SUCESSO!");
                break;
                

                case 2:
                    int i = 0;

                    if (conjCarros.isEmpty()){
                        System.out.println("NENHUM CARRO NA GARAGEM! PFV PREENCHA COM ALGUM VEICULO");
                        break;
                    }

                    for (Carro carro : conjCarros) {
                        System.out.println("[" +(i++)+ "] CARRO DE MARCA: "+carro.getMarca()+ " - CARRO DE MODELO: " +carro.getModelo()+ " - CARRO DE ANO:  "+carro.getAno());
                    }

                    break;

                    case 3:
                        System.out.print("DIGITE QUAL CARRO VC QUER ALTERAR (ÍNDICE): ");
                        int posicaoIndex = scan.nextInt();
                        scan.nextLine(); // Consome a quebra de linha pendente
                    
                        // Verifica se o índice existe na lista
                        if (posicaoIndex < 0 || posicaoIndex >= conjCarros.size()) {
                            System.out.println("ÍNDICE INVÁLIDO!");
                            break;
                        }
                    
                        Carro carro = conjCarros.get(posicaoIndex);
                    
                        // ALTERAÇÃO DA MARCA
                        System.out.println("O CARRO POSSUI ESSA MARCA: " + carro.getMarca());
                        System.out.print("DIGITE A NOVA MARCA DO CARRO (PRESSIONE ENTER PARA PULAR):    ");
                        String novaMarca = scan.nextLine();
                        if (!novaMarca.isEmpty()) carro.setMarca(novaMarca);
                    
                        // ALTERAÇÃO DO MODELO
                        System.out.println("O CARRO POSSUI ESSE MODELO: " + carro.getModelo());
                        System.out.print("DIGITE O NOVO MODELO DO CARRO (PRESSIONE ENTER PARA PULAR):   ");
                        String novoModelo = scan.nextLine();
                        
                        if (!novoModelo.isEmpty()) carro.setModelo(novoModelo);
                    
                        // ALTERAÇÃO DO ANO DE FABRICAÇÃO
                        System.out.println("O CARRO POSSUI ESSE ANO DE FABRICAÇÃO: " + carro.getAno());
                        System.out.print("DIGITE O NOVO ANO DO CARRO (PRESSIONE ENTER PARA PULAR): ");
                        String entradaAno = scan.nextLine(); // Lendo como String para permitir ENTER   sem erro
                        if (!entradaAno.isEmpty()) {
                        try {
                            int novoAno = Integer.parseInt(entradaAno);
                            carro.setAno(novoAno);
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida para o ano! Mantendo o valor original.");
                        }
                    }
                    
                    System.out.println("\nCARRO ATUALIZADO COM SUCESSO!");
                    break;
                

                case 4:
                    System.out.println("AVISO, OLHE A LISTA ANTES DE QUALQUER EXCLUSAO");
                    System.out.print("DIGITE QUAL CARRO VC QUER EXCLUIR (INDEX): ");

                    
                    int indexRemover = scan.nextInt();

                    if (indexRemover < 0 || indexRemover >= conjCarros.size()) {
                        System.out.println("ÍNDICE INVÁLIDO!");
                        break;
                    }
                    conjCarros.remove(indexRemover);

                    System.out.println("CARRO REMOVIDO COM SUCESSO!");
                    break;

                case 5:
                    System.out.println("Saindo do programa! OBRIGADO");
                    return;
                    

                default:
                    System.out.println("OPCAO INVALIDA DO SISTEMA");
                    break;
            }

            
        }
        // Carro veiculo = new Carro("FIAT", "OFF-ROAD", 2025);
    }

    public static void menuComando(){
        System.out.println();
        System.out.println("====== MENU DE COMANDOS DA GARAGEM ======");
        System.out.println("1- ADICIONAR CARROS A GARAGEM");
        System.out.println("2- VISUALIZAR TODOS OS CARROS ");
        System.out.println("3- ALTERAR DADOS DOS CARROS");
        System.out.println("4- EXCLUIR OS CARROS DA GARAGEM");
        System.out.println("5- SAIR DO PROGRAMA");
        System.out.println();
    } 
>>>>>>> 412f37b144ffa7267fd72009f219f274a06d2a20
}