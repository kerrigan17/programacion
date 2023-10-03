import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe un numero entero:");
        int A = in.nextInt();
        System.out.println("Escribe un numero entero:");
        int B = in.nextInt();

        if (B > A){
            for (int numerob = A; numerob<= B; numerob++ ){
                if (numerob%2 == 1){
                    System.out.println("Tus numeros son: " + numerob);
                }
            }
        }
        if (B < A){
            for (int numeroa = B; numeroa<= A; numeroa++ ){
                if (numeroa%2 == 1){
                    System.out.println("Tus numeros son: " + numeroa);
                }
            }
        }

    }
}
