import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Double resultado = 0.0;
        int opcao = 0;
        
        while (opcao != 5){

            System.out.print("\n\nDigite primeiro numero: ");
            Double num1 = sc.nextDouble();

            System.out.print("Digite segundo numero: ");
            Double num2 = sc.nextDouble();
            
            
            System.out.println("\n== MENU ==");
            System.out.println("1- SOMAR");
            System.out.println("2- SUBSTRACAO");
            System.out.println("3- MULTIPLICACAO");
            System.out.println("4- DIVISAO");
            System.out.println("5- SAIR DO PROGRAMA\n");


            System.out.print("Digite o que vc quer: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("O seu resultado:  "+resultado);
                    break;

                case 2: 
                    resultado = num1 - num2;
                    System.out.printf("O seu resultado:  "+resultado);
                    break;

                case 3: 
                    resultado = num1 * num2;
                    System.out.printf("O seu resultado:  "+resultado);
                    break;

                case 4:
                    resultado = num1 / num2;
                    System.out.printf("O seu resultado:  "+resultado);
                    break;

                case 5:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    break;
            }


        }
    }
}
