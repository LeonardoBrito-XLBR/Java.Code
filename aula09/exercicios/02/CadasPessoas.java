import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadasPessoas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =0;

        String nome;
        int idade;
        try {
            FileWriter read = new FileWriter("pessoas.txt");
            
            // QUANTIDADE DE PESSOAS CADASTRADAS
            while (i < 10) {
                System.out.println("DIGITE O SEU NOME   ");
                String nome = scan.nextLine();

                System.out.println("DIGITE SUA IDADE: ");
                int idade = scan.nextInt();

                
                i+= 1;
            }

            System.out.println("TOSOS "+i+ "NOMES CADASRTRADOS");


            read.write("NOME: "+nome+ "- IDADE "+ idade);
            
        } catch (IOException e ){
            System.out.println("");
        }
    }
}