import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {

    public static void main(String[] args) {
        
        try {
            // OBJETO FILEWRITER PARA ESCREVER ARQUIVOS.TXT
            FileWriter escritor = new FileWriter("C:\\Leonardo\\DesenvolvimentoSistema\\aula09\\arquivos\\test.py"); // CRIANDO O AQUIVO | LOCAL DE SALVAMENTO

            escritor.write("print(2+2)");

            escritor.close();

            System.out.println("ARQUIVO SALVO COM SUCESSO!");



        } catch (IOException e ) {
            System.out.println("Ocorreu um erro ao criar arquivo");
            e.printStackTrace();
            
        }
    }
}