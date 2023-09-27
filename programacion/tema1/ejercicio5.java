import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el primer numero:");
        int n1 = in.nextInt();
        System.out.println("Dame el segundo numero:");
        int n2 = in.nextInt();
        System.out.println("Dame el tercer numero:");
        int n3 = in.nextInt();

        int mediasin = (n1 + n2 + n3)/3;
        double mediacon = (n1 + n2 + n3)/3;

        System.out.println("La media sin decimales es: " + mediasin);
        System.out.println("La media sin decimales es: " + mediacon);

    
    }
}
