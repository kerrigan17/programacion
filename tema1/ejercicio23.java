import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Introduce un número entero: ");
            int numero = in.nextInt();

            if (numero < 0) {
                break; 
            }

            suma += numero;
            contador++;
        }

    
        double media = (double) suma / contador;
        System.out.println("La media de los números positivos es: " + media);
    
    }
}

