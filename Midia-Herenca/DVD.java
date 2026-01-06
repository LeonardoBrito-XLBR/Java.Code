public class DVD extends Midia {
    private int codigo;
    private double preco;
    private String nome;
    private int numFaixas;
    

    public DVD (int c, double p, String n, int nF){
        super(c, p, n);
        this.numFaixas = nF;
    }

    @Override
    public String getTipo(){
        return "Tipo: DVD ";
    }

    @Override
    public String getDetalhes(){
        return getTipo() + super.getDetalhes() + numFaixas ;
    }

    
    public void setFaixas(int f) {
        this.numFaixas = f;
    }

    @Override
    public void printDados(){
        System.out.println(getTipo() + super.getDetalhes());
    }

}








    


