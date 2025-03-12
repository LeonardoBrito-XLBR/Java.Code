package atividade;

public class Cachorro extends Animal {
    private String raca;
    // private String cor;


    public Cachorro (String nome, int quantPatas, String raca){
        super(nome, quantPatas);
        this.raca = raca;
    }

    public void exibirSom(){
        System.out.println("AU AU AU");
    }

}
