package atividade;

public class Gato extends Animal {
    // private String raca;
    private String cor;


    public Gato (String nome, int quantPatas, String cor){
        super(nome, quantPatas);
        this.cor = cor;
    }

    public void exibirSom(){
        System.out.println("MIAU MIAUUU");
    }
}
