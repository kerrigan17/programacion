package tema3.arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static int[] CreateArrayMina() {
        int PosicionMina;
        int MinaColocada;
        int[] ArrayPosicionMinas;
        int MinasCompleta = 0;
        ArrayPosicionMinas = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        do {
            MinaColocada = 0;
            do {
                PosicionMina = random.nextInt(0, 20);
                if (ArrayPosicionMinas[PosicionMina] == 0) {
                    ArrayPosicionMinas[PosicionMina] = 7;
                    if(PosicionMina - 1 >= 0 && PosicionMina + 1 != 7){
                        ArrayPosicionMinas[PosicionMina - 1] = ArrayPosicionMinas[PosicionMina - 1] + 1;
                    }
                    if(PosicionMina + 1 <= 19 && PosicionMina + 1 != 7){
                        ArrayPosicionMinas[PosicionMina + 1] = ArrayPosicionMinas[PosicionMina + 1] + 1;
                    }
                    MinaColocada++;
                }
            } while (MinaColocada < 1);
            MinasCompleta++;
        }while(MinasCompleta < 6);
        return ArrayPosicionMinas;
    }
    public static void ImprimirArray(String[] array){
        System.out.println("");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println("");
    }
    public static boolean ImprimirArray2(int[] array, int seleccion1 , String[] array2){
        array2[seleccion1] = String.valueOf(array[seleccion1]);
        for(int i = 0; i < array.length; i++){
            if (seleccion1 == i){
                System.out.println(array[i] + " ");
            } else {
                System.out.print("x" + " ");
            }
        }
        return (array[seleccion1] != 5);
    }
    public static void main (String[] args){
        String[] array2;
        array2 = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        int seleccion1;
        int MinaTocada = 0;
        int EspacioTocado = 0;
        int[] array1 = CreateArrayMina().clone();

        do{
            System.out.println("Donde crees que esta la mina? :");
            seleccion1 = in.nextInt();

            if (ImprimirArray2(array1,seleccion1,array2)){
                MinaTocada++;
            } else {
                EspacioTocado ++;
            }
            ImprimirArray(array2);
        } while (MinaTocada != 5 && EspacioTocado == 0);
        if (MinaTocada == 0){
            System.out.println("Has evitado todas las minas!");
        } else {
            System.out.println("Has tocado una mina");
        }
    }
}
