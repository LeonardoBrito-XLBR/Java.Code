import mod.Periferico;

public class Main {

    public static void main(String[] args) {

        // Televisão
        Televisao tv = new Televisao("4K", 55.0);
        tv.ligar();
        tv.mudarCanal(7);
        tv.ajustarVolume(20);
        tv.ajustarBrilhoTela();
        tv.desligar();

        System.out.println();

        // Computador
        Computador pc = new Computador("i7", "16GB");
        Periferico mouse = new Periferico("Mouse", "Logitech");
        Periferico teclado = new Periferico("Teclado", "Razer");

        pc.ligar();
        pc.adicionarPeriferico(mouse);
        pc.adicionarPeriferico(teclado);
        pc.desligar();

        System.out.println();

        // Smartphone
        Smartphone celular = new Smartphone("100%", "Android");
        celular.ligar();
        celular.carregarBateria();
        celular.instalarApp("WhatsApp");
        celular.desligar();

    }
}