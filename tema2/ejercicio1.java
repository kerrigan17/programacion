package tema2;

import java.util.Scanner;

public class ejercicio1 {

    public static int numberSign(double num) {
        if (num == 0) {
            return 0;
        } else if (num > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        int signo = numberSign(numero);

        if (signo == 0) {
            System.out.println("El número ingresado es igual a 0.");
        } else if (signo == 1) {
            System.out.println("El número ingresado es positivo.");
        } else {
            System.out.println("El número ingresado es negativo.");
        }

    }
}
