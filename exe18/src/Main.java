
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    
      Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        int n2 = teclado.nextInt();
        
        for(int i=n; i<= n2;i++){
           if(i % 3 == 0 && i % 5 !=0){    
                System.out.print("pif; ");
                
            }else if(i % 5 == 0 && i % 3 !=0){
                System.out.print("paf; ");
            }
            
            if(i % 3 == 0 && i % 5 ==0){
                System.out.print("pifpaf; ");
            }
        }
    }
    
}
