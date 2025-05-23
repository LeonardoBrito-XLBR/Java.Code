import java.util.ArrayList;
import java.util.List;

import mod.Periferico;

public class Computador implements Dispositivo {
    private String cpu;
    private String ram;
    private List<Periferico> perifericos;


    public Computador(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
        this.perifericos = new ArrayList<>();
    }


    @Override
    public void ligar() {
        System.out.println("O COMPUTADOR ESTA LIGANDO");
    }
    
    @Override
    public void desligar() {
        System.out.println("O COMPUTADOR ESTA DESLIGANDO");
    }


    public void adicionarPeriferico(Periferico p){
        perifericos.add(p);
        p.conectar();
    }

    public void removerPeriferico(Periferico p){
        perifericos.remove(p);
        p.desconectar();
    }

}
