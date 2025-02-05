package funcao;

public class calculadora {
     
    public void somar (double n1, double n2){
         double resultado = n1+n2;
         System.out.println(resultado);
     }

     public void subt (double n1, double n2){
         double resultado = n1-n2;
         System.out.println(resultado);
     }

     public void mult (double n1, double n2){
         double resultado = n1*n2;
         System.out.println(resultado);
     }

     public void divi (double n1, double n2){
         double resultado = n1/n2;
         System.out.println(resultado);
     }

     public void media_two (double n1, double n2){
         double resultado = (n1+n2) / 2;
         System.out.println(resultado);
     }

     public void media_three (double n1, double n2, double n3){
        double soma = n1 + n2 + n2;
        double resulatdo = soma / 3;
        System.out.println(resulatdo);
     }
     
     // CALCULADORA DE FISICA 
     public void forca (double F, double D){
        double T  = F * D;
        double resulatdo = T;
        System.out.println(resulatdo);
     }

     public void IMC (double peso, double altura){
        double resultado = peso / (altura*altura);
        System.out.println(resultado);

     }

}
