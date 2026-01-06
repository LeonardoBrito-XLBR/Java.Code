public class Midia {

    private int codigo;
    private double preco;
    private String nome;




    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }
    
    public String getTipo(){
        return "Midia Generica";
    }


    public String getDetalhes(){
        return "Codigo: "+ codigo + " Preco: " + preco + " Nome: " + nome;
    }

   public void printDados(){
        System.out.println( getTipo() + getDetalhes() );
   }
    
}