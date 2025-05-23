package mod;

public class Periferico {

    private String tipo;
    private String marca;


    public Periferico(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    
    public void conectar(){
        System.out.println("PERIFERICO CONECTADO: ");
    }


    public void desconectar(){
        System.out.println("PERIFERICO DESCONECTADO...");
    }
}
