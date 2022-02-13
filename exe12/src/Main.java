
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    {
        
     Scanner teclado = new Scanner(System.in); 
        
    int n1, n2, soma=0;
    
    n1 = teclado.nextInt();
    n2 = teclado.nextInt();
    		    
    while(n1 !=0 || n2 !=0 ){
    soma = n1  + n2;
    System.out.print (soma +"\n");
    n1 = teclado.nextInt();
    n2 = teclado.nextInt();
    
    }
	
    }
    }
    
}
