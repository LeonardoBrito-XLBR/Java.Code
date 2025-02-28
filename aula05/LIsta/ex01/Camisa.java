
/*  1-Desenvolva a solução utilizando os conceitos de orientação a objetos e encapsulamento, sabendo que a classe Camisa deve conter os atributos:  -Cor  -Tamanho -tipo */


//CRIANDO UMA CLASS PARA CADA TIPO DE CAMISA
class Camisa {
    private String cor;
    private int tamanho;
    private String tipo;

    //CRIANDO UMA FUNCAO CONSTRUTORA PARA CADA CAMISA 
    public Camisa (String cor, int tamanho, String tipo){
        this.cor = cor ;
        this.tamanho = tamanho  ;
        this.tipo =  tipo ;
    }

    // FUNCAO GET = BUSCAR CADA ITEM NO OBJETO 
    public String getCor (){
        return this.cor;
    }
    public int getTamanho (){
        return this.tamanho;
    }
    public String getTipo(){
        return this.tipo;
    }

    // FUNCAO SET = ALTUALIZAR CADA ITEM NO OBJETO
    public void setCor (String nova_cor){
        this.cor = nova_cor;
    }
    public void setTamanho (int novo_tamanho){
        this.tamanho = novo_tamanho;
    } 
    public void setTipo (String novo_tipo){
        this.tipo = novo_tipo;
    }


    


    
}
