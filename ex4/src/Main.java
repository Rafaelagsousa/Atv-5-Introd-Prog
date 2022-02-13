
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
{
		
    int  n1, n2,n3; 
                
    Scanner teclado  = new Scanner(System.in);
    n1 =teclado.nextInt();
    n2 =teclado.nextInt();
    n3 =teclado.nextInt();
	
    if (n1 > n2 && n1 > n3){
    
    if (n2 > n3){	 
    System.out.print (n1+"\n"+ n2+"\n"+ n3);
    
                }
    else{
    System.out.print (n1+"\n"+n3+"\n"+n2);		 	
        }
		 }
		  if (n2 > n1 && n2 > n3){
		  if (n1 > n3){	 
                 System.out.print (n2+"\n"+n1+"\n"+ n3);
		 }else{
		System.out.print (n2+"\n"+n3+"\n"+n1);		 	
		 }
		 }
		 if (n3 > n1 && n3 > n2){
		 if (n1 > n2){	 
                 System.out.print (n3+"\n"+ n1+"\n"+ n2);
		 }else{
		 System.out.print (n3+"\n"+n2+"\n"+n1);	 	
		 }
		 }
	}

    }
    
}
