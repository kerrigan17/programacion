package POO;

import java.util.Scanner;

public class HeroMain {
  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    Hero heroe1 = new Hero("Mina Dinamita", 1, 150, 150, 0, 25);
    Hero heroe2 = new Hero("Héroe Equilibrado", 1, 120, 120, 0, 20);
    Hero heroe3 = new Hero("Héroe Ágil", 1, 100, 100, 0, 15);
    Hero heroe4 = new Hero("Héroe Resistente", 1, 200, 200, 0, 20);

    System.out.println("Selecciona personaje:");
    System.out.println("1. Mina Dinamita");
    System.out.println("2. Ajo arriero");
    System.out.println("3. Pajaro loco");
    System.out.println("4. Oso poderoso");
    int numero = in.nextInt();
    Hero hero = elegirHeroe(numero, heroe1, heroe2, heroe3, heroe4);
    System.out.println( "Ahora selecciona tu adversario, de la misma manera:");
    int numero2 = in.nextInt();
    Hero otherHero = elegirHeroe(numero2, heroe1, heroe2, heroe3, heroe4);

    Hero.toString(hero,otherHero );
    Hero.attack(hero, otherHero);
    Hero.toString(hero, otherHero);
    Hero.drinkPotion(hero);
    Hero.rest(hero);
    Hero.toString1(hero, otherHero);
  }

  private static Hero elegirHeroe(int opcion, Hero heroe1, Hero heroe2, Hero heroe3, Hero heroe4) {
    switch (opcion) {
        case 1:
          return heroe1;
          case 2:
          System.out.println();
            return heroe2;
        case 3:
            return heroe3;
        case 4:
            return heroe4;
        default:
            System.out.println("Opción no válida. Seleccionando Mina dinamita por defecto.");
            return heroe1;
    }
  }
}
