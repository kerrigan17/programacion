import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class buscaparejas {

    public static void main(String[] args) {
        String[] animales = {"león", "mandril", "suricata", "león", "mandril", "suricata","tigre", "elefante", "rinoceronte", "jirafa",
                "tigre", "elefante", "rinoceronte", "jirafa", "cocodrilo", "hipopótamo", "cebra", "cocodrilo", "hipopótamo", "cebra"};
        Collections.shuffle(Arrays.asList(animales));
        boolean[] visibles = new boolean[animales.length];
        Arrays.fill(visibles, false);
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(animales));
        while (!todosVisibles(visibles)) {
            mostrarTablero(animales, visibles);
            System.out.print("Ingrese la primera posición: ");
            int posicion1 = scanner.nextInt();
            System.out.print("Ingrese la segunda posición: ");
            int posicion2 = scanner.nextInt();
            if (posicion1 < 1 || posicion1 > animales.length || posicion2 < 1 || posicion2 > animales.length || posicion1 == posicion2) {
                System.out.println("Entradas no válidas.");
                continue;
            }
            if (animales[posicion1 - 1].equals(animales[posicion2 - 1])) {
                visibles[posicion1 - 1] = true;
                visibles[posicion2 - 1] = true;
                System.out.println("¡Encontraste una pareja!");
            } else {
                System.out.println("¡Las posiciones no coinciden! Inténtalo de nuevo.");
            }
            for (int i = 0; i < 50; ++i) System.out.println();
        }
        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
    }
    public static void mostrarTablero(String[] animales, boolean[] visibles) {
        System.out.println("Tablero:");
        for (int i = 0; i < animales.length; i++) {
            if (visibles[i]) {
                System.out.print(animales[i] + "\t");
            } else {
                System.out.print("?" + "\t");
            }
        }
        System.out.println();
    }

    public static boolean todosVisibles(boolean[] visibles) {
        for (boolean visible : visibles) {
            if (!visible) {
                return false;
            }
        }
        return true;
    }
}
