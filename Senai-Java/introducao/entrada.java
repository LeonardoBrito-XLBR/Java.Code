import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite seu nome: ");

        String nome =sc.next();

        System.out.print("Digite sua idade: ");

        int idade=sc.nextInt();

        System.out.println("Olá "+nome+" sua idade "+idade+"anos");
        sc.close();
    }
}
