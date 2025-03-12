public class Enfermeiro extends Pessoa {
    
    int horaTrabalho;
    String setor;
    int pis;

    public Enfermeiro(int horaTrabalho, String setor, int pis, String nome, int idade, String documento){
        super(nome, idade, documento);
        this.horaTrabalho = horaTrabalho;
        this.setor = setor;
        this.pis = pis;

    

    }

    //NOVO METEDO PARA O CLASS ENFERMEIRO
    public void printInfo(){
        super.printInfo(); // CHAMANDO O METEDO DA PESSOA
        System.out.println("Hora de trabalho: "+ this.horaTrabalho);
        System.out.println("Setor de trabalho: "+ this.setor);
        System.out.println("CADASTRO DO PIS: "+this.pis);

    }
}
