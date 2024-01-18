package matrix;

import java.util.Scanner;

public class mymatrix {
    static Scanner in = new Scanner(System.in);
    static int array[] = new int [3];
    static int [][] matrix = new int[3][3];
    public static int  [][] matrix(int [][]matrix){
        for (int i =0; i<array.length;i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.println("Introduce el dato de la fila " + (i + 1) + " columna " + (j + 1) + " :");
                int numero = in.nextInt();
                matrix[i][j] = numero;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int i =0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println(" ");
    }
    public static void max (int [][]matrix){
        int max = 0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                if (matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("El numero maximo es " + max);
    }
    public static void min (int [][]matrix){
        int min = 1000;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                if (matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("El numero minimo es " + min);
    }
    public static void media (int [][]matrix){
        int sumatorio = 0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                sumatorio += matrix[i][j];
                System.out.println(sumatorio);
            }
        }
        int media = sumatorio/matrix.length;
        System.out.println("La media es " + media);
    }
    public static void main (String[] args){
        matrix(matrix);
        printMatrix(matrix);
        max(matrix);
        min(matrix);
        media(matrix);
    }
}
