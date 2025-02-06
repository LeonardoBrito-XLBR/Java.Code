package funcao;

import java.util.Scanner;

public class operar {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o seu segundo numero: ");
        double n2 = sc.nextDouble();


        calc.somar(n1, n2);
        calc.subt(n1, n2);
        calc.mult(n1, n2);
        calc.divi(n1, n2);

        sc.close();
    }
    
}
