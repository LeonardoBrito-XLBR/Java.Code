package ArrayList.exercicio1;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Scanner;

/* CRIE UM PROGRAMA EM JAVA QUE CADASTRE  CONTATOS TELEFÔNICOS: NOME E NÚMERO. O PROGRAMA DEVERÁ LISTAR OS CONTATOS CADASTRADOS E EXCLUIR.
// NO PROGRAMA DEVEM TER AS OPÇÕES PARA ESCOLHA:
// 1-CADASTRO
// 2-LISTAR
// 3-EXCLUIR
 4-SAIR */


public class Q1 {
    static Scanner scan;
    public static void main(String[] args) {
        
        scan = new Scanner(System.in);
        Contato cont = new Contato();
        ArrayList<Contato> conjContato = new ArrayList<>();
        
        
        // TABELA DE MENU EXTERNA 
        
        //INICIANDO O LOOP
        while (true){

            menu();
            System.out.print("Digite a sua opção: ");
            int opcao = scan.nextInt();

            //VERIFICANDO A OPCAO DE BREAK 

            switch (opcao) {
                case 1:
                    inserindoContato(cont, conjContato);
                
                    break;
                
                case 2:
                    exibirContatos(cont,conjContato);
                    break;

    

                default:
                    break;
            }    
        }
    }
    
    public static void menu  () {
        System.out.println();
        System.out.println("==== MENU DE COMANDO ====   ");
        System.out.println("DIGITE 1- PARA CADASTRAR UM CONTATO");
        System.out.println("DIGITE 2- PARA EXIBIR A LISTA DE CONTATO");
        System.out.println("DIGITE 3- PARA EXCLUIR UM CONTATO");
        System.out.println("DIGITE 4- PARA ENCERRAR O PROGRAMA");
        System.out.println();

    } 
    
    // METEDO PARA CARREGAR OS DADOS DA CLASSE E ADICIONANDO NA LISTA 
    public static void inserindoContato(Contato cont, ArrayList<Contato> agenda){
        //TRAZENDO OS DADOS DO CONTATO E DA AGENDA 
        
        scan = new Scanner(System.in);
        System.out.print("Digite o nome que deseja inserir: ");
        cont.setNome(scan.nextLine());

        System.out.print("Digite o telefone: ");
        cont.setTelefone(scan.nextLine());

        // ADICIONANDO NA ARRAYLIST O CONTATO 
        agenda.add(cont);

        for (Contato contato : agenda) {
            System.out.println(contato.getNome());
            System.out.println(contato.getTelefone());
        }
    }

    //METEDO PARA EXIBIR OS DADOS DO CONTATO
    public static void exibirContatos(Contato cont, ArrayList<Contato> agenda ){

        for (Contato i : agenda) {
            System.out.println(i.getNome());
            System.out.println(i.getTelefone());
        }
    }


    
}   

    

