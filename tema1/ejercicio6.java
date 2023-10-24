package tema2;

import java.util.Scanner;



public class ejercicio6 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero");
        int n1 = in.nextInt();

        if (n1 == 0){
            System.out.println("El numero " + n1 + " es 0.");
        }else if (n1 > 0) {
            System.out.println("El numero " +n1+ " es positivo.");

        }else {
            System.out.println("El numero " + n1 + " es negativo");

        }

    }
}
