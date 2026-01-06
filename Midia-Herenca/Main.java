public class Main {
    
    public static void main(String[] args) {

        DVD dvd = new DVD(193, 34.90, "Trilha Sonora de Guadiões da Galaxia", 24);
        CD cd  = new CD(192, 49.12, "Melhores musicas de Sao Joao", 14);


       
        dvd.printDados();

        System.out.println();
        
        cd.printDados();
    }
}
