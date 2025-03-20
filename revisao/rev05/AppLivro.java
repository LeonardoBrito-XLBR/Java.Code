package rev05;

import java.util.ArrayList;
import java.util.Scanner;

public class AppLivro {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

      ArrayList<Livro> biblioteca = new ArrayList<>();

        while (true) {

            switch (menu()) {
                case "1":
                    System.out.print("Digite o titulo do livro: ");
                    String titulo = sc.nextLine();

                    System.out.print("Digite o autor do livro: ");
                    String autor = sc.nextLine();

                    System.out.println("Digite o ano do livro: ");
                    int ano = Integer.parseInt(sc.nextLine());

                    System.out.println("Digite o preco do livro: ");
                    double preco = Double.parseDouble(sc.nextLine());

                    biblioteca.add(new Livro(titulo, autor, ano, preco));
                    break;

                case "2": 
                    int i = 0;

                    if (biblioteca.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado!");
                    } else {
                        for (Livro livro : biblioteca) {
                            System.out.println("Livro " + i + ": " + livro);
                            i++;
                        }
                    }

                    break;

                case "3":
    
                    break;
                
                case "4":
            
                    break;
            
                default:
                    break;
            }
        }

        // System.out.println("A OPCAO DESEJADA: "+menu());
        
        
    }

    public static String menu() {
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Remover livro");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        String opcao = sc.nextLine();
        return opcao;

    }

}
