package POO;

import java.util.Scanner;

public class HeroBatalla {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        int turn =0;
        Hero heroe1 = new Hero("Mina Dinamita", 1, 150, 300, 120, 0, 30);
        Hero heroe2 = new Hero("Ajo Arriero", 1, 120, 300, 120, 0, 60);
        Hero heroe3 = new Hero("Pajaro loco", 1, 150, 300, 100, 0, 50);
        Hero heroe4 = new Hero("Oso poderoso", 1, 170, 300, 100, 0, 30);
        System.out.println("Hola amigo, va a empezar la batalla. Elige a tu Heroe: ");
        System.out.println("Selecciona personaje:");
        System.out.println("1. Mina Dinamita");
        System.out.println("2. Ajo arriero");
        System.out.println("3. Pajaro loco");
        System.out.println("4. Oso poderoso");
        int numero = in.nextInt();
        Hero hero = elegirHeroe(numero, heroe1, heroe2, heroe3, heroe4);
        System.out.println("Ahora selecciona tu adversario, de la misma manera:");
        int random = 3;
        Hero[] heroes = new Hero[random];
        for (int i=0; i<heroes.length;i++){
            heroes[i] = new Hero("Contricante "+(i+1), 1, 50, 100, 50, 0, 10);
        }
        while (!exit) {
            turn++;
            System.out.println(hero);
            System.out.println(heroes[1]);
            System.out.println(hero.getName() + " ha golpeado a " + heroes[0].getName());
            hero.setAttack(heroes[random]);
            System.out.println("Apreta S, si quieres salir de la batalla, apreta cualquier otra metra si quieres seguir");
            String letter = in.nextLine().toLowerCase();
            if (letter.equals("s")){
                exit=true;
            }
        }
    }

    private static Hero elegirHeroe(int opcion, Hero heroe1, Hero heroe2, Hero heroe3, Hero heroe4) {
        switch (opcion) {
            case 1:
                return heroe1;
            case 2:
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
