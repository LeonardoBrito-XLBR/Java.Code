package IA;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        CarroCadastrado cadastro = new CarroCadastrado();
        int opcao;

        do {
            // Opções de menu
            String menu = "1. Cadastrar Carro\n2. Listar Carros\n3. Detalhar Carro\n4. Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    // Cadastrar carro
                    String marca = JOptionPane.showInputDialog("Digite a marca do carro:");
                    String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do carro:"));
                    Carro carro = new Carro(marca, modelo, ano);
                    cadastro.cadastrarCarro(carro);
                    JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                    break;
                
                case 2:
                    // Listar carros
                    String listaCarros = cadastro.listarCarros();
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, listaCarros);
                    }
                    break;

                case 3:
                    // Detalhar carro
                    String indexString = JOptionPane.showInputDialog("Digite o número do carro para detalhar:");
                    int index = Integer.parseInt(indexString) - 1;  // Ajusta para índice da lista (0-indexed)
                    String detalhesCarro = cadastro.detalharCarro(index);
                    JOptionPane.showMessageDialog(null, detalhesCarro);
                    break;

                case 4:
                    // Sair
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (opcao != 4);
    }
}
