package IA;
import java.util.ArrayList;

public class CarroCadastrado {
    private ArrayList<Carro> carros;

    // Construtor
    public CarroCadastrado() {
        carros = new ArrayList<>();
    }

    // Método para adicionar um carro à lista
    public void cadastrarCarro(Carro carro) {
        carros.add(carro);
    }

    // Método para listar todos os carros cadastrados
    public String listarCarros() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < carros.size(); i++) {
            lista.append(i + 1).append(" - ").append(carros.get(i).getMarca()).append(" ").append(carros.get(i).getModelo()).append("\n");
        }
        return lista.toString();
    }

    // Método para detalhar um carro específico
    public String detalharCarro(int index) {
        if (index >= 0 && index < carros.size()) {
            return carros.get(index).detalhes();
        } else {
            return "Carro não encontrado.";
        }
    }
}
