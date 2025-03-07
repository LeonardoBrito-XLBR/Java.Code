public class Carro {
    private String marca;
    private String modelo; 
    private int ano;

    // -marca 
    // -modelo 
    // -anoFabricacao.


    //FUNCAO CONSTRUT
    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getMarca (){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public void setMarca(String novaMarca){
        this.marca = novaMarca;
    }
    public void setModelo(String novoModelo){
        this.modelo = novoModelo;
    }
    public void setAno(int novoAno){
        this.ano = novoAno;
    }
    


    
}