
import java.util.ArrayList;
import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Carro> conjCarros = new ArrayList<>();

        while (true){
            menuComando();
            System.out.print("DIGITE A SUA OPCAO: ");
            String opcao = scan.next();

            switch (opcao) {
                case "1":


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
                

                case "2":
                    int i = 0;

                    if (conjCarros.isEmpty() == true){
                        System.out.println("NENHUM CARRO NA GARAGEM! PFV PREENCHA COM ALGUM VEICULO");
                        break;
                    }

                    for (Carro carro : conjCarros) {
                        System.out.println("[" +(i++)+ "] CARRO DE MARCA: "+carro.getMarca()+ " - CARRO DE MODELO: " +carro.getModelo()+ " - CARRO DE ANO:  "+carro.getAno());
                    }

                    break;
                default:
                    
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


    
}

