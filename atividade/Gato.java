package atividade;

public class Gato extends Animal {
    private String cor;


    public Gato (String nome, int quantPatas, String cor){
        super(nome, quantPatas);
        this.cor = cor;
    
    }
    @Override
    public void exibirSom(){
        System.out.println("MIAU MIAUUU");
    }

    @Override
    public void exibirDados(){
        System.out.println("OS DADO DO GATO");
        System.out.println("O nome do animal: "+this.nome);
        System.out.println("Quantidade de patas: "+this.quantPatas);
        System.out.println("A cor do animal: "+this.cor);

    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Gato nome= " + nome + ", cor= "+ cor;
    }

    
    
}
