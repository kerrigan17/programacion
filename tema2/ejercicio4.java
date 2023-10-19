package tema2;

import java.util.Scanner;

public class ejercicio4 {
    public static double euro2dollar(double num){
        return num * 1.05;
    }

    public  static double dollartoeuro(double num){
        return num * 0.95;
    }
    public static String menu (char de){
        if (letter =="D"){
            return  dollartoeuro(double dinero);
        }if (letter == "E"){
            double resultado = de*num;
            return euro2dollar(double dinero);
        }else{
            System.out.println("Tienes que poner 'D' o 'E'.");

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Si quieres de euros a dolares escribe D; y si quieres dolares a euros escribe E");
        char de = in.next().charAt(0);
        System.out.println("¿Cuánto dinero?");
        double dinero = in.nextInt();
        if (de == 'e'){
            return euro2dollar(double num);
            System.out.println("Tu conversion es:" + euro2dollar());

        }


    }
}
