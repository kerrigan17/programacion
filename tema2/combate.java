package tema2;

import java.util.Scanner;

public class combate { 

        public static String selectpersonage(){
        Scanner in = new Scanner(System.in);
        String result = "";
        boolean personver = true;
        System.out.println("Va a empezar el combate, scoge poniendo el numero: ");
        System.out.println("0. Si quieres salir ");
        System.out.println("1. Tigre de Hierro");
        System.out.println("2. Sombra Agil");
        System.out.println("3. Guerrero de Piedra");
        System.out.println("4. Mago Maravilla");
        System.out.println("5. Para elegir tu los valores de los personajes.");
        System.out.println("**************************************************************************");
        int number = in.nextInt();
        while(personver){
            switch(number) {
                case 0:
                    personver = false;
                    break;
                case 1: 
                    result = "Tigre de Hierro";
                    personver = false;
                    break;
                case 2:
                    result = "Sombra Agil";
                    personver = false;
                    break;
                case 3:
                    result = "Guerrero de Piedra";
                    personver = false;
                    break;
                case 4:
                    result = "Mago Maravilla";
                    personver = false;               
                    break;
                default:
                    System.out.println("********************************ERROR*************************************");
                    System.out.println("Introduce un numero valido");
                    number = in.nextInt();
                    break;
                }
        }
        return result;
    }
    public static int calculateDamage(int ataque, int defensa) {
        int damage = (ataque/2) - (defensa/4);
        return damage;
    }
    public static int updateLife(int vida, int damage) {
        int newLife = vida - damage;
        int result =0;
        if (newLife < 0) {
            result = 0;
        } else {
            result = newLife;
        };
        return result;
    }
    public static char barLife (int vida){
        char result = '-'; 
        for (int i = 1; i <= vida; i++) {
            result = '-';
        }
        return result;
        
        
    }

    public static void main(String[] args){ 
        barLife(100);
        String personage1 = selectpersonage();        
        System.out.println("PERSONAJE 1 has elegido a " + personage1);
        System.out.println("**************************************************************************");
        String personage2 = selectpersonage();
        System.out.println("PERSONAJE 2 has elegido a " + personage2);
        System.out.println("**************************************************************************");
    }
}