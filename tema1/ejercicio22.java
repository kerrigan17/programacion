import java.util.Scanner;

public class ejercicio22 {
    public static void main (String[]  arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero:");
        int numero = in.nextInt();

        if (numero%10 <= 9){
            numero
            if (numero%10 <= 9){
            }else {
                System.out.println("Tu numero tiene dos cifras.");
            }
        }else {
            System.out.println("Tu numero tiene una cifra.");
        }
    }
}
