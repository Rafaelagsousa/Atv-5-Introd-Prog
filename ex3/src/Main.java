
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        String estado;
	Scanner teclado  = new Scanner(System.in);
	estado = teclado.nextLine();
        
        
	if (estado.equalsIgnoreCase("RJ")){
            System.out.print ("carioca");
		}
	else if ( estado.equalsIgnoreCase("SP")){
            System.out.print ("paulista");
		}
	else if (estado.equalsIgnoreCase("MG")){
            System.out.print ("mineiro");
		}
	else if (estado.equalsIgnoreCase("RN")){
            System.out.print ("potiguar");
		}
	else if ( estado.equalsIgnoreCase("ES")){
            System.out.print ("capixaba");
		}
	else  if ( estado.equalsIgnoreCase("RS") ){
            System.out.print ("gaucho");
		}
	else if (estado.equalsIgnoreCase("SC")){
            System.out.print ("catarino");
	}
        else {
            System.out.print ("outro estado");
            
            teclado.close(); // entendi foi nada    
	}

    }
    
}
