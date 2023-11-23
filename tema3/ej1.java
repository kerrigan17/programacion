import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    static Scanner in = new Scanner(System.in);
    static int [] array = new int[0];
    static int[] array2  = new int[]{0,2,4,6,8,10,12,14,16,18};

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
            System.out.println("tuArray["+(i+1) +"] = ");
            array[i]=in.nextInt();
        }
        return array;
    }
    public static void imprimirArray(){
        for (int i=0; i <=array2.length; i++){
            System.out.print(array2[i]);
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
    public static void existing(){
        int count=0;
        System.out.println("Dame un numero para ver si esta en tu array:");
        int number = in.nextInt();
        for (int i = 1; i < array2.length; i++){
            if(array2[i]==number){
                count ++;
            }
        }
        if(count>0){
            System.out.println("Tu numero esta en el array!");
        }else{
            System.out.println("Tu numero no esta en el array");
        }

    }
    public static int [] sumaVectortes(){
        System.out.println("Dame el numero de elementos que vas a poner en el Vector:");
        int cantidad = in.nextInt();
        int [] vector1 = new int[cantidad];
        System.out.println("Dame los numeros de tu nuevo Vector1");
        for(int i=0; i<cantidad; i++){
            System.out.println("Vector1["+(i+1) +"] = ");
            vector1[i]=in.nextInt();
        }
        System.out.println("Dame el numero de elementos que vas a poner en el Vector2:");
        int [] vector2 = new int[cantidad];
        System.out.println("Dame los numeros de tu nuevo Vector2");
        for(int i=0; i<cantidad; i++){
            System.out.println("Vector2["+(i+1) +"] = ");
            vector2[i]=in.nextInt();
        }
        int [] vector3 = new int[cantidad];
        for (int i = 0; i<cantidad; i++){
            vector3[i] = vector1[i] +vector2[i];
        }
        return vector3;
    }

    public static int [] restaVectortes(){
        System.out.println("Dame el numero de elementos que vas a poner en el Vector:");
        int cantidad = in.nextInt();
        int [] vector1 = new int[cantidad];
        System.out.println("Dame los numeros de tu nuevo Vector1");
        for(int i=0; i<cantidad; i++){
            System.out.println("Vector1["+(i+1) +"] = ");
            vector1[i]=in.nextInt();
        }
        System.out.println("Dame el numero de elementos que vas a poner en el Vector2:");
        int [] vector2 = new int[cantidad];
        System.out.println("Dame los numeros de tu nuevo Vector2");
        for(int i=0; i<cantidad; i++){
            System.out.println("Vector2["+(i+1) +"] = ");
            vector2[i]=in.nextInt();
        }
        int [] vector3 = new int[cantidad];
        for (int i = 0; i<cantidad; i++){
            vector3[i] = vector1[i] - vector2[i];
        }
        return vector3;
    }
    public static int productosVectortes(){
        System.out.println("Dame el numero de elementos que vas a poner en el Vector:");
        int cantidad = in.nextInt();
        int [] vector1 = new int[cantidad];
        System.out.println("Dame los numeros de tu nuevo Vector1");
        for(int i=0; i<cantidad; i++){
            System.out.println("Vector1["+(i+1) +"] = ");
            vector1[i]=in.nextInt();
        }
        int [] vector2 = new int[cantidad];
        System.out.println("Dame los numeros de tu nuevo Vector2");
        for(int i=0; i<cantidad; i++){
            System.out.println("Vector2["+(i+1) +"] = ");
            vector2[i]=in.nextInt();
        }
        int [] vector3 = new int[cantidad];
        for (int i = 0; i<cantidad; i++){
            vector3[i] = vector1[i] * vector2[i];
        }
        int suma =0;
        for (int i = 0; i<cantidad; i++){
            suma += vector3[i];
        }
        return suma;
    }
    //public static int [] invertirArray(int[] array){
    //    createArray();

    //}
    public static void main (String[] args){
        showMenu();

        char letter = in.next().charAt(0);
        if (letter=='a'){
            imprimirArray();
        }if (letter=='b'){
            createArray();
            System.out.println(Arrays.toString(maxnumber(array)));
        }if (letter=='c'){
            createArray();
            System.out.println(Arrays.toString(minnumber(array)));
        }if (letter=='d'){
            createArray();
            System.out.println(Arrays.toString(average(array)));
        }if (letter=='e'){
            existing();
        }if (letter=='f'){
            System.out.println(Arrays.toString(sumaVectortes()));
        }if (letter=='g'){
            System.out.println(Arrays.toString(restaVectortes()));
        }if (letter=='h'){
            System.out.println(productosVectortes());
        }if (letter=='i'){
            createArray();
        }if (letter=='j'){

        }if (letter=='k'){

        }if (letter=='l'){



        }

    }



}
