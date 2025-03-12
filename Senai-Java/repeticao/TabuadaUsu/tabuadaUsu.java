import java.util.Scanner;

public class tabuadaUsu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite aqui o numero para a tabuada: ");
        int numero = scan.nextInt();
        

        System.out.println("A TABUADO DO "+ numero);
        for (int i = 0; i < 11; i++) {
            System.out.println(numero+" x "+ i +" = "+(numero * i));
        }

        

        scan.close();
    }
}
