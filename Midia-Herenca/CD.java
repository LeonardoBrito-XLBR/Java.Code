public class CD extends Midia {
    private int codigo;
    private double preco;
    private String nome;
    private int numMusicas;



    public CD(int c, double p, String n, int m){
        super(c, p, n);
        this.numMusicas = m;

    }


    @Override
    public String getTipo(){
        return  "Tipo: CD ";
    }

    @Override
    public String getDetalhes(){
        return super.getDetalhes();
    }

    public void setMusicas(int m){
        this.numMusicas = m;
    }

    @Override
    public void printDados(){
        System.out.println(getTipo() + super.getDetalhes());
    }

}
