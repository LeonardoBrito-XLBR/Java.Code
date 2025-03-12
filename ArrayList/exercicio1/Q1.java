import java.util.ArrayList;
import java.util.Scanner;

public class  Q1 {
    public static void main (String[] args ){
        Scanner scan = new Scanner(System.in);
        // //ARRAY ESTATICO 
        String[] conjNomes = new String[6];

        conjNomes[0] = "Leonardo";
        conjNomes[1] = "Carla";
        conjNomes[2] = "Anderson";
        conjNomes[3] = "Felipe";
        conjNomes[4] = "Davi";
        conjNomes[5] = "Alexandre";

        //LACO PARA PERCORRER CADA ITEM EM NO ARRAY 
        for (String nomes : conjNomes) {
            System.out.println(nomes);
        }

    
        System.out.println("");

        // ARRALIST -> DINAMINICO
        ArrayList <String> agendaTel = new  ArrayList<>();

        agendaTel.add("Leonardo");
        agendaTel.add("Andressa");
        agendaTel.add("Carlos");
        agendaTel.add("Fernando");
        agendaTel.add("Vanessa");
        agendaTel.add("Gabriel");

        System.out.println(agendaTel);




        

        scan.close();
    }
}