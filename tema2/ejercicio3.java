package tema2;

import java.util.Scanner;

public class ejercicio3 {
    public static boolean validRadius(double num){
        if (num > 0){
            return true;
        }else {
            return false;
        }
    }
    public  static double calculateCirclePerimeter(double num){
        double pi = 3.14;
        return 2*num*pi;
    }
    public static double calculateCircleArea(double num){
        double pi = 3.14;
        return pi * (num*num);
    }
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);

        System.out.println("Dame un radio y te doy la superficie y el perimetro de un circulo:");
        double radius = in.nextInt();
        boolean radio = validRadius(radius);
        double perimeter = calculateCirclePerimeter(radius);
        double area = calculateCircleArea(radius);
        if (radio){
            System.out.println("El perimetro del circulo es: " + perimeter);
            System.out.println("El area del circulo es: " + area);
        }else {
            System.out.println("Introduce un numero valido");
        }
    }
}
