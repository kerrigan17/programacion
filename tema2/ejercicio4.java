package tema2;

import java.util.Scanner;

public class ejercicio4 {   
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        showMenu();
        int choice = in.nextInt();
        
        if (choice == 1){
            System.out.println("Dame una cantidad de euros");
            double euros = in.nextDouble();
            double dollars = euro2dollar(euros);
            System.out.println("La conversion de " + euros + " euros son " + dollars +" dollares");
        }if (choice == 2){
            System.out.println("Dame una cantidad de dolares");
            double dollars = in.nextDouble();
            double euros = dollar2euro(dollars);
            System.out.println("La conversion de " + dollars + " dolares son " + euros +" dollares.");

        }else{
            System.out.println("Dame un numero");
        }
    }
    public static void showMenu() {
        System.out.println("**** Conversor ****");
        System.out.println("1. Convertir de euros a dólares");
        System.out.println("2. Convertir de dólares a euros");
        System.out.println("Elige una opción: ");
    }

    public static double euro2dollar(double euros){
        double cambio = 1.05;
        return euros * cambio;
    }

    public  static double dollar2euro(double num){
        double cambio = 1.05;
        return num * cambio;
    }
}
