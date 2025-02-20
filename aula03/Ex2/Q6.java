import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = input.nextInt();
        }

        System.out.print("Digite o número a ser buscado: ");
        int numeroBuscado = input.nextInt();

        int contagem = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroBuscado) {
                contagem++;
            }
        }

        System.out.println("O número " + numeroBuscado + " aparece " + contagem + " vezes");

        input.close();
    }
}
