package Tema3;
import java.util.Scanner;

public class WifiRouterMatriz {
    static Scanner in = new Scanner(System.in);
    static int numeroHabitacionesPlanta = 5;
    static int numeroPisos = 10;
    static int potenciaRouter = 4;
    static int[][] MatrizRouter = new int[numeroHabitacionesPlanta][numeroPisos];

    public static void imprimirMatriz(int[][] MatrizHotel) {
        for (int x = 0; x < MatrizHotel.length; x++) {
            for (int y = 0; y < MatrizHotel[0].length; y++) {
                System.out.print(MatrizHotel[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void comprobacionRouter(int[][] MatrizRouter, int numeroHabitacion, int numeroPiso) {
        for (int i = 0; i < MatrizRouter.length; i++) {
            for (int j = 0; j < MatrizRouter[i].length; j++) {
                for (int z = 1; z < potenciaRouter; z++) {
                    for (int x = potenciaRouter - z, y = z; x > 0; x--, y++) {
                        if (numeroPiso - y >= 0) {
                            MatrizRouter[numeroPiso - y][numeroHabitacion] = x;
                        }
                        if (numeroPiso + y <= 11) {
                            MatrizRouter[numeroPiso + y][numeroHabitacion] = x;
                        }
                        if (numeroHabitacion - y >= 0) {
                            MatrizRouter[numeroPiso][numeroHabitacion - y] = x;
                        }
                        if (numeroHabitacion + y <= 4) {
                            MatrizRouter[numeroPiso][numeroHabitacion + y] = x;
                        }
                    }
                }
            }
        }
        imprimirMatriz(MatrizRouter);
    }

    public static void main(String[] args) {

        System.out.print("Elige el piso en el que se encuentra la habitacion (0 - 19): ");
        int numeroPiso = in.nextInt();
        System.out.print("Elige la habitacion (0 - 4): ");
        int numeroHabitacion = in.nextInt();

        for (int x = 0; x < MatrizRouter.length; x++) {
            for (int y = 0; y < MatrizRouter[x].length; y++) {
                MatrizRouter[x][y] = 0;
            }
        }
        comprobacionRouter(MatrizRouter, numeroHabitacion, numeroPiso);
    }

}
