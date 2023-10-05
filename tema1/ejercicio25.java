import java.util.Scanner;

public class ejercicio25 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero y te doy su factorial");
        int numero = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= numero; i++){
            fact = fact * i;
            System.out.println(fact);

        }
    }
}
