// package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class exemplo2 {

    public static void main(String[] args) {
        //CHAMANDO A BIBLIOTECA DE SCANNER
        Scanner scan = new Scanner(System.in);

        //CRIANDO UM ARRAYLIST PARA ARMAZENAR OS STRINGS DESSA VEZ
        ArrayList<String> listaStr = new ArrayList<>();


        //PEDINDO OS DADOS PARA O USUARIO
        System.out.print("Digite nome de paises: ");
        //PRE-DEFININDO A VARIAVEL E ATRIBUINDO VALORES A ELA
        String entrada = scan.nextLine();

        //ADICIONANDO OS VALORES PARA A LISTA ( ArrayList)
        listaStr.add(entrada);

        //EXIBINDO A LISTA
        System.out.println("Elementos da lista: ");

        for (String string : listaStr) {
            System.out.println(string);
        }




    }
}