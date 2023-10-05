
import java.util.Scanner;

public class ejercicio26 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero y te digo si es primo o no:");
        int numero = in.nextInt();

        boolean primo = true;

        for(int i = 2; i<=numero; i++){
            if(numero%2==0){
                primo = false;
                break;
            }
        }
        if (primo){
            System.out.println("El numero " + numero+ " es primo");
        }else {
            System.out.println("El numero " + numero+ " no es primo");
        }
    }
}
