public class App {
    public static void main(String[] args) {
        

        //INSTANCIANDO A CLASS EM UM OBJETO 
        Pessoa aluno = new Pessoa("leonardo", 18, 54.3, false);

        // ACESSANDO O ITEM DO NOME
        System.out.println(aluno.getNome());

        // ALTERANDO O NOME 
        aluno.setNome("Carlos");

        System.out.println(aluno.getNome());
    }
}
