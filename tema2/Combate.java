import java.util.Random;
import java.util.Scanner;

public class Combate {

    static final int MAX_TOTAL_STATS = 500;
    static final int MAX_INDIVIDUAL_STAT = 200;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static class Jugador {
        int velocidad;
        int vida;
        int defensa;
        int ataque;
    }

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        System.out.println("JUGADOR 1");
        readPlayerStats(jugador1);

        System.out.println("JUGADOR 2");
        readPlayerStats(jugador2);

        int roundNumber = 1;
        while (jugador1.vida > 0 && jugador2.vida > 0) {
            System.out.println("\nRONDA " + roundNumber);
            displayStats(jugador1, jugador2);

            makeTurn(jugador1, jugador2);

            System.out.print("Presiona Enter para continuar...");
            scanner.nextLine();
            roundNumber++;
        }

        if (jugador1.vida <= 0) {
            System.out.println("\n¡El jugador 2 ha ganado!");
        } else {
            System.out.println("\n¡El jugador 1 ha ganado!");
        }
    }

    static void readPlayerStats(Jugador jugador) {
        do {
            System.out.print("Velocidad: ");
            jugador.velocidad = scanner.nextInt();
            System.out.print("Vida: ");
            jugador.vida = scanner.nextInt();
            System.out.print("Defensa: ");
            jugador.defensa = scanner.nextInt();
            System.out.print("Ataque: ");
            jugador.ataque = scanner.nextInt();

            int totalStats = jugador.velocidad + jugador.vida + jugador.defensa + jugador.ataque;

            if (totalStats <= MAX_TOTAL_STATS && jugador.velocidad >= 1 && jugador.velocidad <= MAX_INDIVIDUAL_STAT
                    && jugador.vida >= 1 && jugador.vida <= MAX_INDIVIDUAL_STAT
                    && jugador.defensa >= 1 && jugador.defensa <= MAX_INDIVIDUAL_STAT
                    && jugador.ataque >= 1 && jugador.ataque <= MAX_INDIVIDUAL_STAT) {
                break;
            } else {
                System.out.println("Inténtalo de nuevo.");
            }
        } while (true);
    }

    static int calculateDamage(Jugador atacante, Jugador defensor) {
        int damage = Math.max(0, atacante.ataque - defensor.defensa) + random.nextInt(10) + 1;
        return damage;
    }

    static void makeTurn(Jugador jugador1, Jugador jugador2) {
        if (jugador1.velocidad > jugador2.velocidad) {
            Jugador temp = jugador1;
            jugador1 = jugador2;
            jugador2 = temp;
        }

        int damage = calculateDamage(jugador1, jugador2);
        jugador2.vida -= damage;

        if (jugador2.vida > 0) {
            damage = calculateDamage(jugador2, jugador1);
            jugador1.vida -= damage;
        }
    }

    static void displayStats(Jugador jugador1, Jugador jugador2) {
        System.out.println("Jugador 1: " + jugador1.vida + " " + "-".repeat(jugador1.vida));
        System.out.println("Jugador 2: " + jugador2.vida + " " + "-".repeat(jugador2.vida));
    }
}
