import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoArray = 5;
        int conjNumeros [] = new int [tamanhoArray];

        int quant = 0; 

        while (true) {
            menu();

            System.out.print("DIGITE SUA OPCAO DESEJADA: ");
            int opcao = scan.nextInt();

            
            switch (opcao) {
                case 1:
                    if ( quant < tamanhoArray) {
                        System.out.print("Digite o seu numero: ");
                        conjNumeros[quant] = scan.nextInt();
                        quant ++; 
                        System.out.println("numero inserido com sucesso!");

                    } else {
                        System.out.println("Não tem espaço no array");
                    }
                    break;
                    
                case 2:
                    if (quant == 0){
                        System.out.println("O array esta vazio");
                    } else {
                        System.out.println("Numeros armazenados");

                        for (int i = 0; i < quant; i++) {
                            System.out.println(("["+ i + "]" +conjNumeros[i]));                            
                        }
                    }
                    break;

                case 3: 
                    if (quant == 0) {
                        System.out.println("O array esta vazio, Nada para remover");
                    } else {
                        System.out.println("Digite o indince do numero para ser removido (0 a "+ (quant - 1)+ "): ");
                        int indince = scan.nextInt();

                        if (indince >= 0 & indince < quant) {
                            for (int i = 0; i < quant - 1; i++) {
                                conjNumeros[i] = conjNumeros[ i + 1]; 
                                
                            }
                            quant --; 
                            System.out.println("Numero removido com sucesso!");
                            
                        } else {
                            System.out.println("Indince Invalido");
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Saindo do programa!");
                    scan.close();
                    return; 

                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;
            }

            if (opcao == 0) {
                break;
                
            }
        }




    }

    public static void menu(){
        System.out.println();
        System.out.println("===== MENU DE INTERAÇÃO ===== ");
        System.out.println("1- ADICIONAR UM NUMERO ");
        System.out.println("2- EXIBIR OS NUMERO NO ARRAY");
        System.out.println("3- REMOVER O NUMERO ESPERCIFICO");
        System.out.println("4- FINILIZAR O PROGRAMA! ");
        System.out.println();

    }
}