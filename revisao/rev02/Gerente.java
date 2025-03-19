package rev02;

public class Gerente extends Funcionario {
    private double bonus;


    public Gerente (String nome, double salario, String cargo){
        super(nome, salario, cargo);
        this.bonus = salario * 0.10;
    }

    public double getBonus() {
        return bonus;
    }
}
