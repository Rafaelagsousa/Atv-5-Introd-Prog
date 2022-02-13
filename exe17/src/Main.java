
import java.util.Scanner;

 class Main {

   
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();

	teclado.close();

        int fatorial = 1;
        
        for(int i= 1; i<= n;i++){
            fatorial*= i;
        }
        
        System.out.println(fatorial);
    }
}
