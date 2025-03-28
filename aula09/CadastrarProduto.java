import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastrarProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try {
            FileWriter escrita = new FileWriter("produtos.txt", true);

            System.out.print("DIGITE O NOME DO SEU PRODUTO: ");
            String nome = scan.nextLine();

            System.out.print("DIGTE O PRECO DO PRODUTO: ");
            double preco = scan.nextDouble();

            escrita.write(nome + " - R$ "+ preco+ "\n");



            escrita.close();

        } catch (IOException e) {
            System.out.println("ERRO DE CADASTRAR ARQUIVO SEU MANE");
            e.printStackTrace();

        }
    }
}
