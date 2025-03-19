package rev04;

public class Geladeira extends Eletrodomestico{

    private double capacidade;

    public Geladeira(String marca, double pontecia, double capacidade){
        super(marca, pontecia);
        this.capacidade = capacidade;
    }

    @Override
    public void ligar(){
        System.out.println("O EQUIPAMENTO ESTA FUNCIONADO COM A CAPACIDADE MAXIMA: "+capacidade);
    }
    
}