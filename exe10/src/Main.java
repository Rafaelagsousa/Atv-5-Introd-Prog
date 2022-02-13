
import java.text.DecimalFormat;
import java.util.Scanner;

class Main {

   
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");  
        
        float alt1 = teclado.nextFloat();
        float alt2 = teclado.nextFloat();
        float alt3 = teclado.nextFloat();
        float alt4 = teclado.nextFloat();
        
        teclado.close();
        
        double menor = 10000.0;
        double maior = -10000.0;
        double alturaMedia = (alt1 + alt2 + alt3 + alt4)/4;
        
        if (alt1 < menor){
	menor = alt1;
	} 
        
        if (alt2 < menor){
	menor = alt2;
			
        }
        if ( alt3 < menor){
	menor = alt3;
			
	}
        if ( alt4 < menor){
	menor = alt4;
	}

	if (alt1 > maior){
	maior = alt1;
	} 
	if(alt2 > maior){
	maior = alt2;
			
	}
	if ( alt3 > maior){
	maior = alt3;
			
	}
        if ( alt4 > maior){
	maior = alt4;
        }                         
        
        System.out.println("Maior altura: "+df.format(maior)+" metros");
        System.out.println("Menor altura: "+menor+" metros");
        System.out.println("Altura media: "+df.format(alturaMedia)+" metros");
    }
}