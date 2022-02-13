
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        
     int n1, n2, n3, n4;
       Scanner teclado  = new Scanner(System.in);
       n1 = teclado.nextInt ();
       n2 = teclado.nextInt ();
       n3 = teclado.nextInt ();
       n4 = teclado.nextInt ();
     int menor = 10000;
     
     
     if (n1 < menor){
        menor = n1;
    }
     if (n2 < menor){
        menor = n2;
     }
     if ( n3 < menor){
        menor = n3;         
     }
     if ( n4 < menor){
         menor = n4;
     }
     
     System.out.print (menor);
    }  
}
