
import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
    float peso, altura;
    
    Scanner teclado = new Scanner(System.in);
 
    peso = teclado.nextFloat(); 
    altura = teclado.nextFloat();
    teclado.close();
    
        double imc = peso/(altura*altura);

	if ( imc < 18.5){
	System.out.print ("abaixo do peso");
			
	}
        else if ( (imc >=18.5) && (imc < 25) ){
	System.out.print ("peso normal");
			 
	}
        else if ( (imc >= 25) && (imc <= 30) ){
	System.out.print ("acima do peso");
			
	}
        if (imc > 30){
	System.out.print ("obeso");
		}
	}       
    }
    

