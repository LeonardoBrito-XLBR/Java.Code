package bank;


public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;


    public Funcionario( String nome, String cpf, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public Double getSalario(){
        return salario;
    }



    public void setNome(String nomeUsu){
        this.nome = nomeUsu;
    }

    public void  setCPF(String cpfUsu){
        this.cpf = cpfUsu;
    }

    public void setSalario(double salarioUsu){
        this.salario = salarioUsu;
    }
    
}


