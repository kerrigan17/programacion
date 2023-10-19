package tema2;

import java.util.Scanner;

public class ejercicio4 {
    public static String menu (String letter){
        if (letter =="D"){
            return double dolar;
        }if (letter == "E"){
            return double euro;
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


    }
}
