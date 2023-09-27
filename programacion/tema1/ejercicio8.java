import java.util.Scanner;

public class ejercicio8 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame una cantidad en euros: ");
        int n1 = in.nextInt();
        double dolares = n1 * 1.06;
        System.out.println(dolares);


    }
}