import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame la base: ");
        int base = in.nextInt();
        System.out.println("Dame la altura: ");
        int altura = in.nextInt();

        int superficie = (base * altura)/2 ;

        System.out.println("Superficie obtenida: " + superficie);


    }
}
