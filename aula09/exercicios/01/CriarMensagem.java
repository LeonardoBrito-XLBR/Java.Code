import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarMensagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            FileWriter escrever = new FileWriter("mensagemAlien.txt");

            System.out.print("DIGITE SUA MENSAGEM: ");
            String mensagem = scan.nextLine();
            
            escrever.write("A MENSAGEM PARA O ALIEN DA TERRA: " +mensagem);

            System.out.println("mensagem enviada com sucesso! ");
            escrever.close();
        } catch (IOException e) {
            System.out.println("IMPOSSIVEL DE MANDAR ESSA MENSAGEM ");
            e.printStackTrace();
        }
        



    }
}
