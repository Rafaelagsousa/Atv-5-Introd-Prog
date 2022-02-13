
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
        int horas = teclado.nextInt();
        int minutos = teclado.nextInt();
        int seg = teclado.nextInt();

	teclado.close();
        
        int horasSeg = horas * 3600;
        int minSeg = minutos * 60;
        int totalSeg = horasSeg + minSeg + seg;
        
        
        System.out.println(totalSeg);
        
    }
}
