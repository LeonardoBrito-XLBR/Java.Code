public class  tabuada {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);

            int num = 1;
            while(num <11){
                System.out.println("TABUADA DO "+num);
                for (int i = 0; i < 11; i++) {
                    System.out.println("A TABUADA DO "+num+" X "+i+" == "+(num * i));   
                }
                System.out.println();
                num  +=  1; 
            }

        // sc.close();
    }
}
