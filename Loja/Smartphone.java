public class Smartphone implements Dispositivo {
    
    private String bateria;
    private String sistemaOperacional;




    public Smartphone(String bateria, String sistemaOperacional) {
        this.bateria = bateria;
        this.sistemaOperacional = sistemaOperacional;
    }


    @Override
    public void ligar(){
        System.out.println("LIGANDO O SMARTPHONE...");
    }

    @Override
    public void desligar() {
        System.out.println("DESLIGANDO O SMARTPHONE...");
    }


    public void carregarBateria(){
        System.out.println("CARREGANDO BATERIA...");
    }

    public void instalarApp(String app){
        System.out.println("INSTALANDO O APLICATIVO: "+app);
    }

}   
