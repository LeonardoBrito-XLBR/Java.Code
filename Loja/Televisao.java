import mod.Tela;

public class Televisao implements Dispositivo {
    private int canalAtual;
    private int volume;
    private Tela tela;


    
    public Televisao(String resolucao, double tamanho) {
        this.canalAtual = 5;
        this.volume = 20;

        this.tela = new Tela(resolucao, tamanho);
    }


    @Override
    public void ligar(){
        System.out.println("TELEVISAO SENDO LIGADA");
    }


    @Override
    public void desligar(){
        System.out.println("TELEVISAO DESLIGANDO...");
    }


    public void mudarCanal(int novoCanal) {
        canalAtual = novoCanal;
        System.out.println("Canal alterado para: " + canalAtual);
    }

    public void ajustarVolume(int novoVolume) {
        volume = novoVolume;
        System.out.println("Volume ajustado para: " + volume);
    }

    public void ajustarBrilhoTela() {
        tela.ajustarBrilho();
    }
}


