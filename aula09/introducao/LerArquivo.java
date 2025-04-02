import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            // OBJETO PARA LER ARQUIVOS + CARACTER POR CARACTER
            FileReader leitor = new FileReader("arquivo.txt");

            // AQUI IMPORTAMOS METEDO PARA LER BLOCOS MAIORES DE CARACTERES
            BufferedReader bufferedReader = new BufferedReader(leitor);

            String linha;


            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);   
            }
  

        } catch (IOException e){
            System.out.println("ERRO DE LER OS ARQUIVOS MANÉ");
            e.printStackTrace();
        }
    }
}
