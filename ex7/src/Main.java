
import java.util.Scanner;

 class Main {
    
    public static void main(String[] args) {
    
         Scanner teclado = new Scanner(System.in);
        
        int n1 = teclado.nextInt();

	teclado.close();
        
        if(n1 % 2==0 && n1 % 5==0){
	n1= n1 + 5; 
          
        }
        
        else if( n1 % 2!=0){
	 n1= n1 + 8;
         
	}
        System.out.println(n1);
        }
        
    }
