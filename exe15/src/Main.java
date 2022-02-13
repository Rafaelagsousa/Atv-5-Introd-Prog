
import java.util.Scanner;

class Main {

   
    public static void main(String[] args) {
    
              Scanner teclado = new Scanner(System.in);
        
        int impN = 0;
        int intN;
        intN  = teclado.nextInt();

	teclado.close();
        
        for( int n = 1; n <= intN; n = n + 2){
            impN = n + impN;
        }
        
        System.out.println(impN);
    }
}
  
