package rev03;

public  abstract class Animal {
    protected String som;

    public abstract void fazerSom();
}



// Geladeira: Atributo capacidade (double)
// Microondas: Atributo tempoMaximo (int)
// 🔹 Cada subclasse deve ter um método ligar() que imprime uma mensagem indicando o funcionamento do eletrodoméstico.
// 🔹 Na classe Main, crie instâncias de Geladeira e Microondas, e chame o método ligar() para ambas