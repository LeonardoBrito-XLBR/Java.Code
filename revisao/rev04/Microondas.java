package rev04;

public class Microondas extends Eletrodomestico { 
    private int tempoMaximo;

    public Microondas (String marca, double pontecia, int tempoMaximo){
        super(marca, pontecia);
        this.tempoMaximo = tempoMaximo;
    }

    @Override
    public void ligar(){
        System.out.println("O TEMPO MAXIMO DO APARELHO: "+ tempoMaximo);

    }
}
