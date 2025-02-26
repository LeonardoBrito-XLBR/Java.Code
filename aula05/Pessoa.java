class Pessoa {

    // DEFININDO OS DADOS DO USUARIOS E PRIVADO PARA NAO SER ALTERADO
    private String nome;
    private int idade;
    private double peso;
    private boolean casado;


    // FUNCAO OU CONSTRUTOR PARA MONTAR UMA CLASS
    public Pessoa (String nome, int idade, double peso, boolean casado) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.casado = casado;
    }


    // FUNCAO PARA MOSTRAR CADA DADO (GET = BUSCA)

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getPeso(){
        return this.peso;
    }
    public boolean getCasado(){
        return this.casado;
    }



    // FUNCAO PARA ALTERAR O NOME ( RECEBE DO APP.JAVA)
    public void setNome(String nome){
        this.nome = nome;
    }


    
}