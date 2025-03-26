import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerMensagem {
    public static void main(String[] args) {
        
        try {

            //OBJETO PARA LER OS ARQUIVOS == NOME DO ARQUIVO
            BufferedReader ler = new BufferedReader(new FileReader("mensagemAlien.txt"));

            String line;

            while ((line = ler.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("ERRO DE LEITURA: A MENSAGEM ESTA EM OUTRO IDIOMA");
            e.printStackTrace();
        }
    }
}
