package matrix;
import java.util.Arrays;
import java.util.Scanner;

public class MyMatriz {
    static Scanner in = new Scanner(System.in);

    public static int[][] CreateMatriz(int filas, int columnas) {
        int[][] createMatriz = new int[filas][columnas];
        for (int x = 0; x < createMatriz.length; x++) {
            for (int y = 0; y < createMatriz[x].length; y++) {
                System.out.println("Introduce el dato de la fila " + (x + 1) + " columna " + (y + 1) + " :");
                int numero = in.nextInt();
                createMatriz[x][y] = numero;
            }
        }
        return createMatriz;
    }


    public static void MatrizPrint(int[][] MyMatriz) {
        for (int x = 0; x < MyMatriz.length; x++) {
            for (int y = 0; y < MyMatriz[x].length; y++) {
                MyMatriz[x][y] = (x * MyMatriz.length) + (y + 1);
                System.out.print((MyMatriz[x][y]) + " ");
            }
            System.out.println(" ");
        }
    }


    public static int MatrizGreatestNumber(int[][] MyMatriz) {
        int Maximo = MyMatriz[0][0];
        for (int x = 1; x < MyMatriz.length; x++) {
            for (int y = 1; y < MyMatriz[x].length; y++) {
                if (MyMatriz[x][y] > Maximo) {
                    Maximo = MyMatriz[x][y];
                }
            }
        }
        return Maximo;
    }


    public static int MatrizMinimumNumber(int[][] MyMatriz) {
        int Minimo = MyMatriz[0][0];
        for (int x = 1; x < MyMatriz.length; x++) {
            for (int y = 0; y < MyMatriz[x].length; y++) {
                if (MyMatriz[x][y] < Minimo) {
                    Minimo = MyMatriz[x][y];
                }
            }
        }
        return Minimo;
    }

    public static double MatrizAverage(int[][] MyMatriz) {
        double average = MyMatriz[0][0];
        int lengthnum = 0;
        for (int x = 0; x < MyMatriz.length; x++) {
            for (int y = 0; y < MyMatriz[x].length; y++) {
                average += MyMatriz[x][y];
                lengthnum++;
            }
        }
        return average / lengthnum;
    }

    public static String MatrizExistence(int[][] MyMatriz) {
        String ValueValidator = "Ese valor no esta en la matriz";
        System.out.print("Introduce el numero que desees comprobar si esta en la matriz: ");
        int Number = in.nextInt();
        for (int x = 0; x < MyMatriz.length; x++) {
            for (int y = 0; y < MyMatriz[x].length; y++) {
                if (MyMatriz[x][y] == Number) {
                    ValueValidator = "Ese valor esta en la matriz";
                }
            }
        }
        return ValueValidator;
    }

    public static int MatrizVecesRepetidas(int[][] MyMatrtiz) {
        int numerosale = 0;
        for (int x = 0; x < MyMatrtiz.length; x++) {
            for (int y = 0; y < MyMatrtiz[x].length; y++) {
                if (numerosale == MyMatrtiz[x][y]) {
                    numerosale++;
                }
            }
        }
        return numerosale;
    }

    public static int[][] SumArray(int[][] MyMatriz1, int[][] MyMatriz2) {
        int[][] suma = new int[3][3];
        for (int x = 0; x < MyMatriz1.length || x < MyMatriz2.length; x++) {
            for (int y = 0; y < MyMatriz1[x].length || y < MyMatriz2[x].length; y++)
                suma[x][y] = MyMatriz1[x][y] + MyMatriz2[x][y];
        }
        return suma;
    }

    public static int[][] RestArray(int[][] MyMatriz1, int[][] MyMatriz2) {
        int[][] resta = new int[3][3];
        for (int x = 0; x < MyMatriz1.length || x < MyMatriz2.length; x++) {
            for (int y = 0; y < MyMatriz1[x].length || y < MyMatriz2[x].length; y++) {
                resta[x][y] = MyMatriz1[x][y] - MyMatriz2[x][y];
            }
        }
        return resta;
    }

    public static String MatrizUnidad(int[][] MyMatriz) {
        String comprobacion = "No es unidad";

        for (int x = 0; x < MyMatriz.length; x++) {
            for (int y = 0; y < MyMatriz[x].length; y++) {
                if (MyMatriz[x][x] == 1 && x == y) {
                    comprobacion = "Es unidad";
                } else if (MyMatriz[x][y] == 0 && y != x) {
                    comprobacion = "Es unidad";
                }
            }
        }
        return comprobacion;
    }

    public static void main(String[] args) {
        int[][] MyMatriz1;
        int[][] MyMatriz2;

        System.out.println("Introduzca el numero de filas que quiere que tenga su Matriz :");
        int numeroFilas = in.nextInt();
        System.out.println("Introduzca el numero de columnas que quiere que tenga su Matriz :");
        int numeroColumnas = in.nextInt();
/*
        System.out.println("Imprimir una matriz : ");
        MyMatriz1 = CreateMatriz(numeroFilas, numeroColumnas);
        MatrizPrint(MyMatriz1);

        MyMatriz1 = CreateMatriz(numeroFilas,numeroColumnas);
        System.out.println("El mayor es: " + MatrizGreatestNumber(MyMatriz1));

        MyMatriz1 = CreateMatriz(numeroFilas,numeroColumnas);
        System.out.println("El menor es: " + MatrizMinimumNumber(MyMatriz1));

        MyMatriz1 = CreateMatriz(numeroFilas, numeroColumnas);
        System.out.println("La media es " + MatrizAverage(MyMatriz1));

        MyMatriz1 = CreateMatriz(numeroFilas,numeroColumnas);
        System.out.println(MatrizExistence(MyMatriz1));

        MyMatriz1 =  CreateMatriz(numeroFilas,numeroColumnas);
        System.out.println(MatrizVecesRepetidas(MyMatriz1));

        MyMatriz1 = CreateMatriz(numeroFilas,numeroColumnas);
        MyMatriz2 = CreateMatriz(numeroFilas,numeroColumnas);
        System.out.println("La suma entre " + Arrays.deepToString(MyMatriz1) + " y " + Arrays.deepToString(MyMatriz2) + " es " + Arrays.deepToString(SumArray(MyMatriz1, MyMatriz2)));


        MyMatriz1 = CreateMatriz(numeroFilas, numeroColumnas);
        MyMatriz2 = CreateMatriz(numeroFilas, numeroColumnas);
        System.out.println("La resta entre " + Arrays.deepToString(MyMatriz1) + " y " + Arrays.deepToString(MyMatriz2) + " es " + Arrays.deepToString(RestArray(MyMatriz1, MyMatriz2)));

        MyMatriz1 = CreateMatriz(numeroFilas,numeroColumnas);
        System.out.println("La siguiente matriz " + Arrays.deepToString(MyMatriz1));
        MatrizUnidad(MyMatriz1);

 */
    }
}
