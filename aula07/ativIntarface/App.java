import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampada l = new Lampada();

        System.out.print("DIGITE O 1: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                l.estaLigado();
                break;
        
            default:
                break;
        }
    }
}
