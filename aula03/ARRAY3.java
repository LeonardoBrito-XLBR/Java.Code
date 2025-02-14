public class ARRAY3 {
    public static void main(String[] args) {
        
        String [] alunos = {"Ana", "Leonardo", "Fernanda", "Paula"};
        double [] numeros = {4.5, 5, 68, 193};

        for (int i =0 ; i<alunos.length; i++){
            System.out.println("Aluno" + alunos[i]+ "Nota: "+ numeros[i]);
        }
    }
}
