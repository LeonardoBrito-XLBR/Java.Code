
import java.util.ArrayList;

public class exemplo1 {
    public static void main(String[] args) {

        //DEFININDO UM ARRAY 

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);



        //EXIBINDO OS ELEMENTOS DO ARRAY
        System.out.println("Elementos dentro do arrayList de inteiros: "+numeros);
        
        // CALCULANDO O TAMANHO DO ARRAY
        int tamanho = numeros.size();
        System.out.println("Tamanho do ArrayList: "+tamanho);

        // VERIFICAÇÃO A EXISTENCIA DE UM ELEMENTO
        boolean existeElemento = numeros.contains(30); // ELEMENTO QUE VC QUER PROCURAR
        System.out.println("Existe o elemento 30? "+ existeElemento);

        // REMOVENDO UM ELEMENTO DO ARRAY
        numeros.remove(Integer.valueOf(30)); //REMOVENDO O VALOR (30)
        // numeros.remove(30); // REMOVENDO O INDEX 30 

        System.out.println("Removido o valor 30");

        System.out.println("Valores atuais do Array");
        for (Integer i : numeros) {
            System.out.println(i);
        }
    }

}