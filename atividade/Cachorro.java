package atividade;

public class Cachorro extends Animal {
    private String raca;



    public Cachorro (String nome, int quantPatas, String raca){
        super(nome, quantPatas);
        this.raca = raca;
        
    }

    public void exibirSom(){
        System.out.println("AU AU AU");
    }

    public void exibirDados(){
        System.out.println("OS DADO DO CACHORRO");
        System.out.println("O nome do animal: "+this.nome);
        System.out.println("Quantidade de patas: "+this.quantPatas);
        System.out.println("A raca animal: "+this.raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    

}
