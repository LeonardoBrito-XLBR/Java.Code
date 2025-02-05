import java.util.Scanner;

public class entrada2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite seu segundo numero: ");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;

        System.out.println(soma);

        sc.close();
    }
}
