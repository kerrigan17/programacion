package Tema3;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;

public class AnimalesParejas {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static String[] CreateAnimalesArray() {
        int contadorPosicion;
        int contadorAnimal = 0;
        int Posicion = 0;
        String[] ArrayPosiciones;
        ArrayPosiciones = new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] ArrayAnimales;
        ArrayAnimales = new String[]{"Alpaca", "Chachito", "Perro", "Manatee", "Tiburon", "Larva", "Perro", "Rata", "Iguanodon", "Libelula"};

        do {
            contadorPosicion = 0;
            do {
                Posicion = random.nextInt(0, 20);
                if (ArrayPosiciones[Posicion].equals("0")) {
                    ArrayPosiciones[Posicion] = ArrayAnimales[contadorAnimal];
                    contadorPosicion++;
                }
            } while (contadorPosicion < 2);
            contadorAnimal++;
        } while (contadorAnimal <= 9);
        return ArrayPosiciones;
    }

    public static boolean ImprimirParejas(String[] array, int seleccion1, int seleccion2, String[] array2) {
        if (array[seleccion1].equals(array[seleccion2])) {
            array2[seleccion1] = array[seleccion1];
            array2[seleccion2] = array[seleccion2];
        }
        for (int i = 0; i < array.length; i++) {
            if (seleccion1 == i) {
                System.out.print(array[i] + " ");

            } else {
                if (seleccion2 == i) {
                    System.out.print(array[i] + " ");
                } else {
                    System.out.print("-" + " ");
                }
            }

        }
        return (array[seleccion1].equals(array[seleccion2]));
    }

    public static void ImprimirArray(String[] array) {
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        String[] array2;
        array2 = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        int seleccion1;
        int seleccion2;
        int ContadorParejas = 0;
        String[] array1 = CreateAnimalesArray().clone();

        do {
            System.out.print("Elige el primer animal :");
            seleccion1 = in.nextInt();
            System.out.print("Elige el segundo animal :");
            seleccion2 = in.nextInt();
            if (ImprimirParejas(array1, seleccion1, seleccion2, array2)) {
                ContadorParejas++;
            }
            ImprimirArray(array2);
        } while (ContadorParejas != 10);

        System.out.println("Has encontrado todas las parejas!");

    }
}