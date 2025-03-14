import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        System.out.print("Digite o seu numero: ");
        String numStr = sc.nextLine();
        try{
            int numInt = Integer.parseInt(numStr);
            System.out.println("String agora é um numero: "+numInt);

        } catch(Exception e){
            System.out.println("Impossivel converter o numero: "+numStr+" because, caracteres invalidis ");
        } finally {
            System.out.println("PRONTO...");
        }
        
        sc.close();
    }

}