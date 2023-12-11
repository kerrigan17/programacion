package matrices;
import java.util.Random;
import java.util.Scanner;

public class atrapamoscas2 {
    public static void main(String[] args) {
        char[][] tablero = crearTablero(4, 4);
        int[] posicionMosca = colocarMosca(tablero);

        boolean juegoTerminado = false;
        Scanner scanner = new Scanner(System.in);

        while (!juegoTerminado) {
            imprimirTablero(tablero);

            System.out.print("Ingresa la fila (1-4): ");
            int filaJugador = scanner.nextInt() - 1;
            System.out.print("Ingresa la columna (1-4): ");
            int columnaJugador = scanner.nextInt() - 1;

            if (!esPosicionValida(filaJugador, columnaJugador, 4, 4)) {
                System.out.println("Posición no válida. Inténtalo de nuevo.");
                continue;
            }

            if (filaJugador == posicionMosca[0] && columnaJugador == posicionMosca[1]) {
                System.out.println("¡Has atrapado a la mosca! ¡Ganaste!");
                juegoTerminado = true;
            } else {
                moverMosca(tablero, posicionMosca);
            }
        }

        scanner.close();
    }

    public static char[][] crearTablero(int filas, int columnas) {
        return new char[filas][columnas];
    }

    public static void imprimirTablero(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] colocarMosca(char[][] tablero) {
        Random rand = new Random();
        int filaMosca = rand.nextInt(4);
        int columnaMosca = rand.nextInt(4);

        tablero[filaMosca][columnaMosca] = 'M';

        return new int[]{filaMosca, columnaMosca};
    }

    public static boolean esPosicionValida(int fila, int columna, int filas, int columnas) {
        return fila >= 0 && fila < filas && columna >= 0 && columna < columnas;
    }

    public static void moverMosca(char[][] tablero, int[] posicionMosca) {
        int fila = posicionMosca[0];
        int columna = posicionMosca[1];

        int[][] movimientos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Random rand = new Random();
        rand.nextInt(4);

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];

            if (esPosicionValida(nuevaFila, nuevaColumna, 4, 4) && tablero[nuevaFila][nuevaColumna] != 'M') {
                tablero[fila][columna] = '_';
                tablero[nuevaFila][nuevaColumna] = 'M';
                posicionMosca[0] = nuevaFila;
                posicionMosca[1] = nuevaColumna;
                break;
            }
        }
    }
}
