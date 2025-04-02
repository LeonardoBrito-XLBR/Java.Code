
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerLista {
    public static void main(String[] args) {
        try {

            //IMPORTANTO A CLASS DE LER ARQUIVOS PARA LER ESSE ARQUIVO + ARMAZENANDO EM UMA VARIAVEL (ler)
            FileReader ler = new FileReader("C:\\Users\\Leandro\\Desktop\\CODE\\Java.Code\\aula09\\exercicios\\02 - Menu\\listaPessoas.txt");

            BufferedReader bufferedReader = new BufferedReader(ler);

            //VARIAVEL PARA LER CADA LINHA DO ARQUIVO
            String linha;

            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }
            
            //FECHANDO A LEITURA
            bufferedReader.close();
        } catch (IOException e) {   
            e.printStackTrace();
        }
    }
}
