public class AppPessoa {
    public static void main(String[] args) {

        System.out.println("Informações do Paciente: ");

        Pessoa paciente = new Paciente("leonardo", 12, "121212", "SULAMREICA", "Preimum");

        paciente.printInfo();

        System.out.println("\n Informacors do Enfermeiro");

        Pessoa enfeimeiro = new Enfermeiro(24, "cirugia", 12312, "Carlos",24, "123121");

        enfeimeiro.printInfo();
        

    


    }
}
