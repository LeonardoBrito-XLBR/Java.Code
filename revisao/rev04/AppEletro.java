package rev04;

public class AppEletro {
    public static void main(String[] args) {
        Geladeira Smart = new Geladeira("SAMSUNG", 500, 700);
        Microondas UltraVison = new Microondas("LG", 400, 900);

        Smart.ligar();
        UltraVison.ligar();
    }
}
