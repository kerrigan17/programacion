package Tema3;
import java.util.Arrays;
import java.util.Scanner;


public class MyArray {
    static Scanner in = new Scanner(System.in);
    public static void menuArray(){
        System.out.println("Elige una de las siguientes opciones a continuacion :");
        System.out.println(" a) Imprime el array." +
                "\n b) Cual es el maximo numero en el array." +
                "\n c) Cual es el minimo numero en el array." +
                "\n d) Cual es la media del array." +
                "\n e) El elemento existe en el array?." +
                "\n f) Cual es la suma de estos dos vectores." +
                "\n g) Cual es la resta de estos dos vectores." +
                "\n h) CUal es el producto escalar de estos dos vectores." +
                "\n i) Invierte el orden del siguiente array." +
                "\n j) Averigua si el array es capicua.");
    }

    public static int[] CreateArray() {
        int cantidad = 6;
        int MyArray[] = new int[cantidad];
        System.out.println("Introduzca " + cantidad + " numeros a continuacion :");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Numero " + (i + 1) + " = ");
            int number = in.nextInt();
            MyArray[i] = number;
        }
        return MyArray;
    }


    public static void ArrayNumberPrint(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Arrays.toString(Array));
            break;
        }
    }


    public static int ArrayGreatestNumber(int[] Array) {
        int Maximo = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > Maximo) {
                Maximo = Array[i];
            }
        }
        return Maximo;
    }


    public static int ArrayMinimumNumber(int[] Array) {
        int Minimo = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < Minimo) {
                Minimo = Array[i];
            }
        }
        return Minimo;
    }


    public static double ArrayAverage(int[] Array) {
        double average = Array[0];
        for (int i = 0; i < 5; i++) {
            average += Array[i];
        }
        return average / Array.length;
    }

    public static String ArrayExistence(int[] Array) {
        String ValueValidator = "Ese valor no esta en el array";
        System.out.print("Introduce el numero que desees comprobar si esta en el array: ");
        int Number = in.nextInt();
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == Number) {
                ValueValidator = "Ese valor esta en el array";
            }
        }
        return ValueValidator;
    }


    public static int[] SumArray(int[] MyArray1, int[] MyArray2) {
        int[] suma = new int[6];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++) {
            suma[i] = MyArray1[i] + MyArray2[i];
        }
        return suma;
    }


    public static int[] RestArray(int[] MyArray1, int[] MyArray2) {
        int[] resta = new int[6];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++) {
            resta[i] = MyArray1[i] - MyArray2[i];
        }
        return resta;
    }


    public static int EscalarProductArray(int[] MyArray1, int[] MyArray2) {
        int result = 0;
        int[] producto = new int[3];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++) {
            producto[i] = MyArray1[i] * MyArray2[i];
            result += producto[i];
        }
        return result;
    }

    public static void InvertirArray(int[] MyArray1) {
        int k;
        for (int i = 0; i < MyArray1.length / 2; i++) {
            k = MyArray1[i];
            MyArray1[i] = MyArray1[MyArray1.length - i - 1];
            MyArray1[MyArray1.length - i - 1] = k;
        }
        System.out.println(Arrays.toString(MyArray1));
    }

    public static String ArrayCapicua(int[] MyArray1) {
        String esCapicua = "Es capicua";
        int length = MyArray1.length;
        for (int i = 0; i < MyArray1.length / 2; i++) {
            if (MyArray1[i] != MyArray1[length - i - 1]) {
                esCapicua = "No es capicua";
            }
        }
        return esCapicua;
    }

    public static void main(String[] args) {
        int[] MyArray1;
        int[] MyArray2;
        menuArray();
        System.out.print("Introduzca la letra de la opcion :");
        String eleccion = in.nextLine();

        switch(eleccion){
            case "a":
                MyArray1 = CreateArray();
                ArrayNumberPrint(MyArray1);
                break;
            case "b":
                MyArray1 = CreateArray();
                System.out.println("El mayor es: " + ArrayGreatestNumber(MyArray1));
                break;
            case "c":
                MyArray1 = CreateArray();
                System.out.println("El menor es: " + ArrayMinimumNumber(MyArray1));
                break;
            case "d":
                MyArray1 = CreateArray();
                System.out.println("La media de " + Arrays.toString(MyArray1) + " es " + ArrayAverage(MyArray1));
                break;
            case "e":
                MyArray1 = CreateArray();
                System.out.println(ArrayExistence(MyArray1));
                break;
            case "f":
                MyArray1 = CreateArray();
                MyArray2 = CreateArray();
                System.out.println("La suma entre " + Arrays.toString(MyArray1) + " y " + Arrays.toString(MyArray2) + " es " + Arrays.toString(SumArray(MyArray1,MyArray2)));
                break;
            case "g":
                MyArray1 = CreateArray();
                MyArray2 = CreateArray();
                System.out.println("La resta entre " + Arrays.toString(MyArray1) + " y " + Arrays.toString(MyArray2) + " es " + Arrays.toString(RestArray(MyArray1,MyArray2)));
                break;
            case "h":
                MyArray1 = CreateArray();
                MyArray2 = CreateArray();
                System.out.println("El producto escalar de " + Arrays.toString(MyArray1) + " y " + Arrays.toString(MyArray2) + " es " + EscalarProductArray(MyArray1,MyArray2));
                break;
            case "i":
                MyArray1 = CreateArray();
                System.out.println("Este array  " + Arrays.toString(MyArray1) + " invertido se ve asi: ");
                InvertirArray(MyArray1);
                break;
            case "j":
                MyArray1 = CreateArray();
                System.out.println("Es el siguiente array capicua? " + Arrays.toString(MyArray1) + ArrayCapicua(MyArray1));
                break;
        }
    }
}