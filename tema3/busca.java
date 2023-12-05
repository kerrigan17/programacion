import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class busca {

    public static final int tablero = 20;
    public static final int minas = 6;

    public static void main(String[] args) {
        char[] tableroVisible = new char[tablero];
        char[] tableroOculto = new char[tablero];

        Arrays.fill(tableroVisible, ' ');
        Arrays.fill(tableroOculto, ' ');

        colocarMinas(tableroOculto);
        calcularPistas(tableroOculto);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarTablero(tableroVisible);

            System.out.print("Selecciona una posición (0-19): ");
            int seleccion = scanner.nextInt();

            if (tableroOculto[seleccion] == '*') {
                System.out.println("¡Has perdido! Había una mina en esa posición.");
                mostrarTablero(tableroOculto);
                break;
            } else {
                tableroVisible[seleccion] = tableroOculto[seleccion];
            }

            if (esVictoria(tableroVisible, tableroOculto)) {
                System.out.println("¡Has ganado! Has descubierto todas las casillas sin minas.");
                mostrarTablero(tableroOculto);
                break;
            }
        }
    }

    private static void colocarMinas(char[] tablero) {
        Random random = new Random();
        int minasColocadas = 0;

        while (minasColocadas < minas) {
            int posicion = random.nextInt(busca.tablero);

            if (tablero[posicion] != '*') {
                tablero[posicion] = '*';
                minasColocadas++;
            }
        }
    }

    private static void calcularPistas(char[] tablero) {
        for (int i = 0; i < busca.tablero; i++) {
            if (tablero[i] != '*') {
                int count = 0;
                for (int j = Math.max(0, i - 1); j <= Math.min(busca.tablero - 1, i + 1); j++) {
                    if (tablero[j] == '*') {
                        count++;
                    }
                }
                tablero[i] = (char) (count + '0');
            }
        }
    }

    private static void mostrarTablero(char[] tablero) {
        for (int i = 0; i < busca.tablero; i++) {
            System.out.print(tablero[i] + "*");

        }
        System.out.println();
    }

    private static boolean esVictoria(char[] tableroVisible, char[] tableroOculto) {
        for (int i = 0; i < tablero; i++) {
            if (tableroVisible[i] == ' ' && tableroOculto[i] != '*') {
                return false;
            }
        }
        return true;
    }
}
