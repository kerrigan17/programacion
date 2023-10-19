package tema2;

import java.util.Scanner;

public class ejercicio2 {

    public static int numberSign(double numero) {
        if (numero == 0) {
            return 0;
        } else if (numero > 0) {
            return 1;
        } else {
            return -1;
        }
    }
    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tu edad: ");
        int edad = scanner.nextInt();
        boolean esMayor = isAdult(edad);
        if (esMayor ){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres menor de edad");
        }


        
    }
}
