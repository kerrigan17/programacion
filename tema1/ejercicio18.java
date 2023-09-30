import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero");
        double numero = in.nextInt();

        if (numero >= 0){
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero+ " es " + raiz);
        }else{
            System.out.println("ERROR");
            
        }
    }
}