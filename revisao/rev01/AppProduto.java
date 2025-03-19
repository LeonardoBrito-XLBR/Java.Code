package rev01;

import java.util.Scanner;

public class AppProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        //ADICIONANDO VALORES PRIMARIOS DE UMA CLASS
        Produto produtoUni = new Produto("SAPATO", 49.90, 10);

        //FUNCOES DO SISTEMA
        produtoUni.exibirDados();
        produtoUni.calcularValor();

        System.out.println("\n=======================\n");

    
        //ALTERANDO CADA VALOR 
        produtoUni.setNome("GELADEIRA");
        produtoUni.setPreco(125);
        produtoUni.setQuantidade(5);
        
        //ACESSANDO FUNCAO DE NOVOS VALORES
        produtoUni.exibirDados();
        produtoUni.calcularValor();
        
        

        scan.close();
    }

}
