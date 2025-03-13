package atividade;

public class Animal {

    // ATRIBUTOS PARA CADA ANIMAL EXISTENTE
    String nome;
    int quantPatas;

    //FUNCAO CONSTRUTORA
    public Animal(String nome, int quantPatas){
        this.nome = nome;
        this.quantPatas = quantPatas;
    }


    public void exibirSom(){
    System.out.println("SOM DE ANIMAL");
    
    }


    public void exibirDados(){
        
    }


    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", quantPatas=" + quantPatas + "]";
    }
    
}