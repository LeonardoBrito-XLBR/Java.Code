import java.util.Scanner;

public class ARRAYSTRING3 {
    public static void main(String[] args) {

        //IMPORTANDO O SCANNER E APELIDANDO COMO "SCANNER"
        Scanner sc = new Scanner(System.in);

        //PEDINDO O TAMANHO AO USUARIO
        System.out.print("Quantos nomes deseja inserir: ");
        int tamanho = sc.nextInt();


        sc.nextLine(); // CONSUMI UMA LINHA > QUEBRA LINHA

        // INSERINDO O TAMANHO DO ARRAY COM BASE NO INT DO USUARIO 
        String  [] nomes  = new String [tamanho];

        for (int i = 0; i < nomes.length; i++){
            System.out.print("Digite o nome" + (i+1) + ": ");
            nomes[i] = sc.nextLine();

        }

        System.out.println("\nNomes digitados:");


        for(int i =0; i < nomes.length; i++){
            System.out.println("Nomes na posição "+ (i+1) + ": "+ nomes[i]);
        }


        sc.close();

    }
}
