package rev03;

public class Gato extends Animal {

    String som = "MIAU MIAU MIAU";
    @Override
    public void fazerSom(){
        System.out.println("O GATO FAZ: "+som);
    }
}