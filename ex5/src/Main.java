import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
    float aV1, aV2, frequencia;
    
    Scanner teclado = new Scanner(System.in);
    
    aV1 = teclado.nextFloat();
    aV2= teclado.nextFloat();
    frequencia = teclado.nextFloat();
    
        float media = (aV1 + aV2)/2;
        if ( ( frequencia < 50) || ( aV1 < 4.0 && aV2 < 4.0) ){
	System.out.print("reprovado");
			
	}
        else if ( ( aV1 < 4.0 || aV2 < 4.0) || (media < 6.0) ){
	System.out.print("recuperacao");
                        
	}
        else{
	System.out.print("aprovado");
        
	}
		
		
		     
	}
    }
