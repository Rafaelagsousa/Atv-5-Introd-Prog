
import java.util.Scanner;

class Main {

    
    public static void main(String[] args) {
    
         
        Scanner teclado = new Scanner(System.in);
        
        int base = teclado.nextInt();
        int expoente = teclado.nextInt();
        
        int potencia =1;
        
        for(int i= 0; i< expoente;i++){
            potencia*= base;
        }
        
        System.out.println(potencia);
        
    }
}
