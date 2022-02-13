
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
        
        float nota1 = teclado.nextFloat();
        float nota2 = teclado.nextFloat();
        float nota3 = teclado.nextFloat();
        float nota4 = teclado.nextFloat();

	teclado.close();
        
            double media = (nota1 + nota2+ nota3 + nota4)/4;
        
            if(media >= 7.0){
            System.out.println("aprovado");
            }
            if(media >= 5.0 && media < 7.0){
            System.out.println("recuperacao");
            }
            if(media < 5.0){
            System.out.println("reprovado");
            }
        }
    
}
