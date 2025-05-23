package mod;

public class Tela {
    private String resolucao;
    private double tamanho;


    public Tela (String resolucao, Double tamanho){
        this.resolucao = resolucao;
        this.tamanho = tamanho;
    }


    public void ajustarBrilho(){
        System.out.println("AJUSTANDO BRILHO DA TELA....");
    }
}
