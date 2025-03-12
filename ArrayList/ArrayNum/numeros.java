package ArrayNum;


// Crie uma classe TesteArrayListNumero que possui
// um método main.
// 2. Dentro do main crie um ArrayList de Integer.
// 3. Adicione 10 números informados pelo usuário.
// 4. Se o usuário tiver digitado os números 10, 100 ou
// 1000 mostre uma mensagem informando que ele
// ganhou um bônus de R$ 50,00.


import java.util.ArrayList;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        ArrayList <Integer> conjNumeros = new ArrayList<>();
        
        int bonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o seu "+ (i+1)+" numero: ");
            int num = scan.nextInt();
            scan.nextLine(); //CONSUME O ENTER

            if (num == 10 || num == 100 || num == 1000 || num > 10000){
                bonus += 50;
                System.out.println("PARABENS VC GANHOU 50 DE BONUS!");
            }

            conjNumeros.add(num);
        }

        System.out.println("\n === OS NUMEROS DIGITADOS === ");
        System.out.println(conjNumeros+"\n");
            
        System.out.print("Deseja ver os seus pontos extras? (sim ou nao): ");
        String opcao = scan.nextLine();
        
        // SEGURANCA DO USUARIO
        opcao = opcao.toLowerCase();
                
        if (opcao.equals("sim") ){
            System.out.println("SEUS PONTOS TOTAIS: "+bonus);
        
        } else {
            System.out.println("SAINDO DO PROGRAMA...");
        }

        scan.close();
    }
}