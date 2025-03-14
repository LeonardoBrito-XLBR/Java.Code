public class Array {
    public static void main(String[] args) {
        int[ ] Array={12,13,14,15};

        int indice = 6;

        try{
            System.out.println("Elemento no indice "+indice+":"+Array[indice]);

        } catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Indice invalido no tamanho do array");

        } finally{
            System.out.println("Valeu...");
        }
    }
}
