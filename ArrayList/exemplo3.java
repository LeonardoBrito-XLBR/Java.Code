// package ArrayList;

import java.util.ArrayList;

public class exemplo3 {
    public static void main(String[] args) {

        //CRIANDO A ARRAY LIST -> DEFININDO O TIPO -> NOME
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Anderson");
        listaNomes.add("Paulo");
        listaNomes.add("Carla");
        listaNomes.add("Rafael");


        //EXIBINDO OS NOMES 
        System.out.println("Primeiros nomes: "+ listaNomes);

        // ACESSANDO O ELEMENTO PELO INDEX 
        System.out.println("O nome na posição 0: "+listaNomes.get(0));

        //INTERACAO SOBRE ELEMENTOS 
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        //REMOVENDO UM ELEMENTO ESPERCIFICO
        listaNomes.remove("Paulo");

        System.out.println("LISTA DEPOIS DA REMOÇÃO: "+listaNomes);

    }
}
