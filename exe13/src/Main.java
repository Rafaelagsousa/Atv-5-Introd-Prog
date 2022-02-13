
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    
    int n1, n2;
            
      Scanner teclado = new Scanner(System.in);
    
    n1 = teclado.nextInt(); 
    n2 = teclado.nextInt();
            
    while(n2 == 0 ){
    n2 = teclado.nextInt();
		  
    }
    int valorN = n1/n2; 
    
    System.out.println(valorN);
    
    }
}
    
