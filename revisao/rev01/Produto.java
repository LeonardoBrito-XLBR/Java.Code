package rev01;
public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void calcularValor(){
        double resultado = preco * quantidade;

        System.out.println("O VALOR DO ESTOQUE DE "+nome+" ESTA AVALIADO EM R$"+resultado);
    }
    
    public void exibirDados(){
        System.out.println("PRODUTO NOME:  "+nome);
        System.out.println("PRODUTO PRECO: "+preco);
        System.out.println("PRODUTO QUANTIDADE: "+quantidade);
    }
}