public class Paciente extends Pessoa {
    String matricula;
    String planeSaude;

    // TRAZENDO NOVAMENTE OS ATRIBUTOS DA PESSOA 
    public Paciente (String nome, int idade, String documento, String matricula, String planeSaude){

        // USANDO O SUPER PARA ATRIBUIR SEUS VALORES A ELA
        super(nome, idade, documento);
        this.matricula = matricula;
        this.planeSaude = planeSaude;
        

    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Plano de Saude: "+ this.planeSaude);

    }
}
