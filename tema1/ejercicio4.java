import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int n1 = in.nextInt();
        System.out.println("Dame el segundo numero");
        int n2 = in.nextInt();
        System.out.println("Dame el tercer numero");
        int n3 = in.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("El numero primer es mayor");
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("El segundo numero es mayor");

        }else {
            System.out.println("El tercer numero es mayor");

        }

    }
}
