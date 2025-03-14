import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu numerador: ");
        int numerador = sc.nextInt();
        
        System.out.println("Digite o seu demoninador: ");
        int demoninador = sc.nextInt();
        
        int resultado = 0;
        try{
            
            resultado = numerador/demoninador;

            System.out.println(resultado);

        } catch(ArithmeticException e){
            System.out.println("Erro: divisão por zero impossivel");
        
        } catch(Exception e){
            System.out.println("Erro inesperado"+e.getMessage()); 
        
        }finally{
            System.out.println("Finalizando...");
        }

        
    }
}