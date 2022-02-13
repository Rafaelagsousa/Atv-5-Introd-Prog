
import java.util.Scanner;

 class Main {

    Scanner teclado = new Scanner(System.in);
     
    public static void main(String[] args) {
    float salarioB= 1.1F;
    float valorP= 1.1F;
       
    Scanner teclado = new Scanner(System.in);
    salarioB = teclado.nextFloat(); 
    valorP =teclado.nextFloat ();
    double valorMax = salarioB * 0.3;
    
    if ( valorP > valorMax){
    System.out.print("nao");
    
    }
    else{
    System.out.print("sim");
    
    }

    }
    
}
