import java.util.Scanner;

public class ejercicio9 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame una cantidad en dolares: ");
        double n1 = in.nextDouble();
        double euros = n1 * 0.95;
        System.out.println(euros);
    }
}