import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanho = 0; 
        int conjNumeros [];
        String resultado = ""; 

        System.out.print("Quantos numero vc quer analisar: ");
        tamanho = scan.nextInt();

        conjNumeros = new int [tamanho];


        for (int i = 0; i < tamanho; i++) {
            // IMPLEMNRTAR UMA ANIMÇÃO DESCRECENTE
            System.out.print("Digite seus numeros: ");
            conjNumeros[i] += scan.nextInt();

        }
        /*
         * MOSTRA QUAL NUMERO É PAR E QUAL NUMERO É IMPAR
         */


         boolean todosPares = true;

         for (int i = 0; i < tamanho; i++) {
            if (conjNumeros[i] % 2 != 0) {
                todosPares = false;
                break;
            }
        }


        if (todosPares){
            System.out.println("TODOS OS NUMNEROS SÃO PARES");
        } else {
            System.out.println("NEM TODOS OS NUMEROS SÃO PARES");
        }
        scan.close();

    }
}
