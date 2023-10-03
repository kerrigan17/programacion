import java.util.Scanner;

public class ejercicio22 {
    public static void main (String[]  arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero:");
        int numero = in.nextInt();
        int cifras = 0;

        if (numero == 0) {
            cifras = 1;
        } else {
            // Mientras el número sea diferente de 0, dividimos entre 10
            // y aumentamos el contador de cifras
            while (numero != 0) {
                cifras++;
                numero = numero / 10;
            }

        }
        System.out.println(cifras);
    }
}
