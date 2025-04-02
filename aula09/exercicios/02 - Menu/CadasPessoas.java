import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadasPessoas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =0;
        
        try {
            FileWriter read = new FileWriter("C:\\Users\\Leandro\\Desktop\\CODE\\Java.Code\\aula09\\exercicios\\02 - Menu\\listaPessoas.txt");

            String nome = null;
            int idade = 0;
            
            // QUANTIDADE DE PESSOAS CADASTRADAS
            while (i < 3) {
                System.out.print("DIGITE O SEU NOME ");
                nome = scan.nextLine();

                System.out.print("DIGITE SUA IDADE: ");
                idade = scan.nextInt();
                scan.nextLine();

                read.write("NOME: "+nome+ " - IDADE "+ idade+"\n");
                
                i+= 1;
            }
            read.close();
            
            System.out.println("\nTOSOS "+i+ " NOMES CADASRTRADOS");
            
        } catch (IOException e ){
            System.out.println("ERRO AO ESCREVER OS NOMES");
            e.printStackTrace();
        }
    }
}