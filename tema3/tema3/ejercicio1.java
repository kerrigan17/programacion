package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    static Scanner in = new Scanner(System.in);
    static int [] array = new int[10];
    public static int [] createArray(){
        int newArray = {};
        System.out.println("Dame el numero de elementos que vsa a poner");
        int elementos = in.nextInt();
        System.out.println("Dame los numeros de tu nuevo Array");
        newArray = new int[elementos];
        newArray =  in.nextInt();
        return newArray;
    }
    public static void imprimirArray(){
        for (int i=0; i <=array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int [] maxnumber (int[] array){
        int max = array[0];
        for (int i= 0; i <array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return new int[]{max};
    }
    public static int [] minnumber (int[] array){
        int min = array[0];
        for (int i= 0; i <array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return new int[]{min};
    }
    public static int[] average(int [] array) {
        int suma = array[0];
        int media = 0;
        for (int i = 1; i < array.length; i++) {
            suma += array[i];
            media = suma / array.length;
        }
        return new int[]{media};
    }
   // public static boolean [] existing(int [] array){
     //   for (int i = 1; i < array.length; i++){

    //    }
    //}

    public static void main (String[] args){
        array  = new int[]{1,20,25,3,6};
        System.out.println(Arrays.toString(average(array)));
    }



}
