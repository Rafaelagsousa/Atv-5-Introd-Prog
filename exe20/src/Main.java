
import java.util.Scanner;

 class Main {

   
public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

int qtAuto;     
int qtDia= teclado.nextInt();;
int soma=0, media=0, menor = 999999999, maior = -999999999;

for( int cont = 0; cont < qtDia; cont ++){
qtAuto= teclado.nextInt();
soma= soma + qtAuto;

if ( qtAuto>maior){
maior = qtAuto;
		 
}
if ( qtAuto<menor){
menor = qtAuto;
}
}
/////////////////////////////
media = soma/qtDia;
System.out.println ("Quantidade produzida nos "+qtDia+" dias: "+soma);
System.out.println("Media diaria de producao: "+media);
System.out.println("Menor producao diaria: "+menor);
System.out.println("Maior producao diaria: "+ maior);
}
 }
