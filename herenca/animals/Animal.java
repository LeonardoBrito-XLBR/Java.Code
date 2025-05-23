

public class Animal {
    private String nome;

    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void comer(){
        System.out.printf("O "+nome+"comeu");
    }

    public void bebeu(){
        System.out.printf("O "+nome+"bebeu"); 
    }

    public void dormir(){
        System.out.println("O "+nome+"dormiu");
    }
    
}
