
import javax.swing.JOptionPane;

public class JOPTIONPANE {

    public static void main(String[] args) {
        //PRINT
        JOptionPane.showConfirmDialog(null, "HELLO WORLD", "TELA INICIAL", 2 );


        //INPUT -- 
        String opcao = JOptionPane.showInputDialog(null, "1 - FILE DE FRANGO \n 2 - FRANGO ASSADO \n 3- LASANHA DE FRANGO", "MENU", 3 );


        System.out.println(opcao);
    }
}