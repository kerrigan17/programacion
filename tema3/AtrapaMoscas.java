import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtrapaMoscas {
    static int[] array  = new int[16];
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        array = new int []{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0};

        System.out.println("Busca la mosca! Debes de poner un numero del 0 al 15, y si no aciertas, cambiara aleatoriamente");
        boolean cazada = false;
        while(!cazada){
            int posicion = random.nextInt(15);
            int[] arrayMosca = array.clone();
            int numero = in.nextInt();
            arrayMosca[posicion] = 1;
            if (arrayMosca[numero]==1){
                System.out.println("Has cazado a la mosca!");
                cazada =true;
            }else {
                System.out.println("Sigue buscando!!!");
            }
            System.out.println(Arrays.toString(arrayMosca));
        }

    }
}
