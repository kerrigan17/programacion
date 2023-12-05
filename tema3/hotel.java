import java.util.Arrays;
import java.util.Scanner;

public class hotel {
    static int[] array = new int [20];
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        array = new int []{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("Dame tu numero de habitacion");
        int numero = in.nextInt();
        numero--;
        System.out.println("Dame la potencia de tu wifi del 1 al 6");
        int potencia = in.nextInt();
        if (numero>array.length || numero<1 || potencia<1 || potencia>=6){
            System.out.println("No has puesto los parametros correctos.");
        }
        array[numero]=potencia;
        for (int i = 0; i<=potencia; i++){
            if (numero - i >= 0) {
                array[numero - i] = potencia - i;
            }
            if (numero + i < array.length) {
                array[numero + i] = potencia - i;
            }
        }
        System.out.println("Resultado: " + Arrays.toString(array));
    }
}

