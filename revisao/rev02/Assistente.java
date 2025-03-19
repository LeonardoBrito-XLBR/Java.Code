package rev02;

public class Assistente extends Funcionario {

    Assistente (String nome, double salario, String cargo){
        super(nome, salario, cargo);
    }

    public double calculoBonus(){

        return getSalario() * 0.05;
    }
}
