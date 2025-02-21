package ArrayList.exercicio1;

import java.lang.invoke.StringConcatFactory;

import javax.sql.rowset.serial.SerialStruct;

public class Contato {
    private String nome;
    private String telefone;
    


    public void setNome (String nome){
        this.nome = nome;

    }

    public void setTelefone(String telefone){
        this.telefone =telefone;
    }

    public String getNome(){
        return this.nome;
   }

   public String getTelefone (){
    return this.telefone;
   }

}


