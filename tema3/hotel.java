import java.util.Scanner;

public class hotel {
    static int[] array = new int [20];
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        array = new int []{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("Dame tu numero de habitacion");
        int numero = in.nextInt();
        System.out.println("Dame la potencia de tu wifi");
        int potencia = in.nextInt();
    }
}
