import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un 0 o un 1");
        int numero = in.nextInt();

        if (numero == 0){
            System.out.println("Perimetro del cuadrado = 4*lado. Superficie del cuadrado = base*altura");
        }if else(numero == 1){
            System.out.println("Perimetro del rectangulo = 2*base + 2*altura. Superficie del rectangulo = base*altura");

        }else{
            System.out.println("ERROR")
            
        }
    }
}
