package atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        Gato gatinho = new Gato("Lozen", 4, "laranga");
        Gato gatinho2 = new Gato("Lo", 4, "la");
        Gato gatinho3 = new Gato("zen", 4, "ranga");
        Gato gatinho4 = new Gato("en", 4, "ga");

        ArrayList<Animal>  listaAnimal = new ArrayList<>();
        listaAnimal.add(gatinho);
        listaAnimal.add(gatinho2);
        listaAnimal.add(gatinho3);
        listaAnimal.add(gatinho4);
        System.out.println(listaAnimal.size());
        
        listaAnimal.stream().forEach(System.out::println);

        // for(Animal anim : listaAnimal){
        //     System.out.println("Gato nome="+ anim.nome +" cor="+ anim.cor);
        // }

        gatinho.exibirSom();
        gatinho.exibirDados();
        System.out.println();
        
        System.out.println(gatinho.getCor());
        
        System.out.print("Digite a cor do seu gato: ");
        gatinho.setCor(sc.nextLine());
        
        System.out.println(gatinho.getCor());
        


        Animal cachorro = new Cachorro("Rex", 4, "Budog");

        cachorro.exibirSom();
        cachorro.exibirDados();

        sc.close();

    }
        
}
