
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cadastro {

    static String arquivo = "Lista.txt";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //IMPOTANTO AS BIBLIOTECAS

        String nome = null;
        int idade = -1;

        
        try {
            FileWriter escrever = new  FileWriter(arquivo, true);
            escrever.write("==== TABELA DE PESSSOAS ====\n");
            escrever.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            menu();


            int opcao = scan.nextInt();
            scan.nextLine();
            System.out.println();
                switch (opcao) {
                    case 1:
                        System.out.print("DIGITE O SEU NOME: ");
                        nome = scan.nextLine();
                        System.out.print("DIGITE A SUA IDADE: ");
                        idade = scan.nextInt();

                        escreverNomes(arquivo, nome, idade);
                        break;
                    
                    case 2:
                        leitorListar(arquivo);
                        break;

                    case 3:
                        System.out.println("SAINDO DO PROGRAMA...");
                        return;
                        
                    default:
                        System.out.println("OPCAO ERRADA - NAO LISTADA");
                        break;
                }      
        }
    }

    public static void menu(){
        System.out.println();
        System.out.println("---- TABELA DOS COMANDOS ----");
        System.out.println("1- CADASTRAR PESSOAS");
        System.out.println("2- LER PESSOAS CADASTRADAS");
        System.out.println("3- SAIR");
        System.out.print("ESCOLHA SUA OPCAO: ");

    }
    // ------ FUNCAO DE ESCREVER NOS ARQUIVOS
    public static void escreverNomes(String arquivo, String nome, int idade){
        // INICIALIZANDO O METEDO DE ESCREVER AQUI IMPORNTANDO NESSA FUNCAO 
        try {

            int i = 0;
            //INSTANCIANDO A BIBLIOTECA
            FileWriter escrever = new  FileWriter(arquivo, true);

           
            escrever.write("NOME: "+nome+ " | IDADE: "+idade+"\n");   
            escrever.close();

            
            System.out.println("PESSOAS CADASTRADAS! ");

        } catch (IOException e) {
            System.out.println("Erro em escrever a mensagem mano :L");
            e.printStackTrace();
        }

    }

    //----- FUNCAO DE LER OS ARQUIVOS
    public static void leitorListar(String arquivo){

        // INICIALIZANDO 
        try {
            //INSTANCIANDO A BIBLIOTECA
            BufferedReader leitor = new BufferedReader (new FileReader(arquivo));

            String linha;

            while ((linha = leitor.readLine()) != null){
                System.out.println(linha);
                System.out.println();
            }


        

        } catch (IOException e) {
            System.out.println("Erro em ler a mensagem mano :L");
            e.printStackTrace();
        }

    }
    
}
