
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame la base: ");
        int base = in.nextInt();
        System.out.println("Dame la altura: ");
        int altura = in.nextInt();

        int superficie = base * altura ;
        int perimetro = (base * 2) + (altura *2);

        System.out.println("Superficie obtenida: " + superficie);
        System.out.println("Perimetro obtenido: " + perimetro);

    }
}