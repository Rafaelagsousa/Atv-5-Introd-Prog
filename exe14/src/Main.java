
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        int quant = teclado.nextInt();
        
        int idade;
        double peso, somaP = 0;
        
        for(int i = 0; i< quant; i++){
            idade = teclado.nextInt();
            peso = teclado.nextDouble();
            
            if(idade>30){
                somaP+=peso;
            }
        }

	teclado.close();
        
        System.out.println(somaP);
    }
}
