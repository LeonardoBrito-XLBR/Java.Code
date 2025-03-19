package rev03;

import java.util.ArrayList;

public class AppFazendo {
    public static void main(String[] args) {
        ArrayList<Animal> conjAnimals = new ArrayList<>();


        Animal galfield = new Gato();
        Animal Rex = new Cachorro();
        Animal Mimosa = new Vaca();


        conjAnimals.add(galfield);
        conjAnimals.add(Rex);
        conjAnimals.add(Mimosa);

        for (Animal animal : conjAnimals) {
            animal.fazerSom();
        }
    }
}
