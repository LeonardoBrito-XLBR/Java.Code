package rev02;

public class AppFuncionario {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("Carla", 1500, "Desing UX-UI");
        Gerente gerente = new Gerente("Leonardo", 4500, "Desenvolvedor");
    
        System.out.println(assistente.calculoBonus());
        
        System.out.println(gerente.getBonus());
    }    
}
