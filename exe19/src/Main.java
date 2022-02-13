
import java.text.DecimalFormat;
import java.util.Scanner;

class Main {

    
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    float alt1= teclado.nextFloat();
    float alt2= teclado.nextFloat();
    float alt3= teclado.nextFloat();
    float alt4= teclado.nextFloat();
    
    double menor = 10000.0;
    double maior = -10000.0;
		
		
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
		if (alt2 > maior){
			maior = alt2;
			
		}
		if ( alt3 > maior){
			maior = alt3;
			
		}
		if ( alt4 > maior){
			maior = alt4;
		}
		////////////////////////////////////
    double menorDel2 = 1000.0, maiorDel2 = -1000.0, a1, a2, a3, a4;
    a1 = teclado.nextDouble();
    a2= teclado.nextDouble();
    a3 = teclado.nextDouble();
    a4 = teclado.nextDouble();
		
		if(a1 < menorDel2){
			menorDel2 = a1;
		} 
		if (a2 < menorDel2){
			menorDel2 = a2;
			
		}
		if( a3 < menorDel2){
			menorDel2 = a3;
			
		}
		if ( a4 < menorDel2){
			menorDel2 = a4;
          }
	     if (a1 > maiorDel2){
			maiorDel2 = a1;
		} 
		if (a2 > maiorDel2){
			maiorDel2 = a2;	
		}
		if ( a3 > maiorDel2){
			maiorDel2 = a3;
			
		}
		if ( a4 > maiorDel2){
			maiorDel2 = a4;
		}
		//////////////////////////////////
    double menorDel3 = 1000.0, maiorDel3 = -1000.0, al1, al2, al3, al4;
    al1 = teclado.nextDouble();
    al2 = teclado.nextDouble();
    al3 = teclado.nextDouble();
     al4 = teclado.nextDouble();
		
		if (al1 < menorDel3){
			menorDel3 = al1;
		} 
		if (al2 < menorDel3){
			menorDel3 = al2;
			
		}
		if ( al3 < menorDel3){
			menorDel3 = al3;
			
		}
		if ( al4 < menorDel3){
			menorDel3 = al4;
          }
          if (al1 > maiorDel3){
			maiorDel3 = al1;
		} 
		if (al2 > maiorDel3){
			maiorDel3 = al2	;
		}
		if ( al3 > maiorDel3){
			maiorDel3 = al3;
			
		}
		if ( al4 > maiorDel3){
			maiorDel3 = al4;
                }
         DecimalFormat df = new DecimalFormat("0.0#");
		
    double alturaMedia = (alt1 + alt2 + alt3 + alt4 + a1 + a2 + a3 + a4 + al1 + al2 + al3 + al4 )/12;
      
       
      System.out.println("Maior altura");
        System.out.println("Delegacao 1: "+df.format(maior));
        System.out.println("Delegacao 2: "+maiorDel2);
        System.out.println("Delegacao 3: "+maiorDel3+"\n");
        
        System.out.println("Menor altura");
        System.out.println("Delegacao 1: "+menor);
        System.out.println("Delegacao 2: "+menorDel2);
        System.out.println("Delegacao 3: "+menorDel3+"\n");
        System.out.println("Altura media: "+df.format(alturaMedia));
}
}

