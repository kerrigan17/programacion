

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    static Scanner in = new Scanner(System.in);
    static int [] array = new int[0];

    public static void showMenu(){
        System.out.println("Escribe la letra segun lo que quieras:");
        System.out.println("a. Imprimir el array");
        System.out.println("b. Maximo de tu array");
        System.out.println("c. Minimo de tu array");        
        System.out.println("d. Media de tu array");
        System.out.println("e. Te digo si tu array existe");
        System.out.println("f. Suma de dos vectores");
        System.out.println("g. Resta de dos vectores");
        System.out.println("h. Producto esclar de dos vectores");
        System.out.println("i. Invertir el numero de un array");
        System.out.println("j. Indica si el array es capicua o no");
    }

    public static int [] createArray(){
        System.out.println("Dame el numero de elementos que vas a poner en el array:");
        int cantidad = in.nextInt();
        array = new int[cantidad];
        System.out.println("Dame los numeros de tu nuevo Array");
        for(int i=0; i<cantidad; i++){
            System.out.print("tuArray["+(i+1) +"] = ");
            array[i]=in.nextInt();
        }
        System.out.println("Tu Array es: " + array);
        return array;
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
    public static void existing(int [] array){
        int count=0;
        System.out.println("Dame un numero para ver si esta en tu array:");
        int number = in.nextInt();
        for (int i = 1; i < array.length; i++){
            if(array[i]==number){
                count ++;
            }
        }
        if(count>0){
            System.out.println("Tu numero esta en el array!");
        }else{
            System.out.println("Tu numero no esta en el array");
        }

    }
    static int [] sumaVectores(){
        int[] vector1 = new int[2];
        for(int i=0; i<=2; i++){
            System.out.print("Vector 1 ["+(i+1) +"] = ");
            vector1[i]=in.nextInt();
        }
        int[] vector2 = new int[2];
        for(int i=0; i<=2; i++){
            System.out.print("Vector 2 ["+(i+1) +"] = ");
            vector2[i]=in.nextInt();
        }
        return vector1;
    }

    public static void main (String[] args){
        showMenu();
        //System.out.println("Tus numeros son: " + Arrays.toString(createArray()));
        char eleccionLetra = in.next().charAt(0);
        switch(eleccionLetra){
            case 
        }
        sumaVectores();
    }



}
