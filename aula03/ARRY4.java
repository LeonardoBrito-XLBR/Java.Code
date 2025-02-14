import java.util.Scanner;

public class ARRY4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CRIANDO A ARRAY E DANDO TAMANHO EM INDEX
        int [] numeros = new int[5];

        //VARIAVEL GLOBAL
        int soma = 0;

        // PARA CADA I NO TAMANHO DO ARRAY
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número"+ (i+1)+"º: ");

            //ADD NA POSICAO DO LOOP O NUMERO DIGITADO
            numeros[i] = sc.nextInt();

            //ACESSANDO CADA NUMERO ANTES DE TERMINAR O LOOP E SOMANDO A VARIAVEL (SOMA)
            soma+= numeros[i];
            
        }
        
        // System.out.println(numeros);
        System.out.println("A soma de todos o elementos do array é: "+ soma);
        sc.close();
    }
}
