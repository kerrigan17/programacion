import java.util.Scanner;

public class practica_combate {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);

        int velocidad1 = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int vida1 = 0;
        int total1 = 501;

        int velocidad2 = 0;
        int ataque2 = 0;
        int defensa2 = 0;
        int vida2 = 0;
        int total2 = 501;


        while(total1 > 500){
            System.out.println("Va a comenzar el combate, recuerda que tus cinco atributos tienen que sumar maximo 500: ");
            System.out.println("Elige la velocidad del JUGADOR 1: ");
            velocidad1 = in.nextInt();
            System.out.println("Elige el ataque del JUGADOR 1: ");
            ataque1 = in.nextInt();
            System.out.println("Elige la defensa del JUGADOR 1:");
            defensa1 = in.nextInt();
            System.out.println("Elige la vida del JUGADOR 1:");
            vida1 = in.nextInt();

            total1 = velocidad1 + ataque1 + defensa1 + vida1;

            if (total1>500 && velocidad1 <= 200 && velocidad1>0 && ataque1<=200 && ataque1>0 && defensa1<=200 && defensa1>0 && vida1<=200 && vida1>0){
                System.out.println("Datos incorrectos");
            }
        }
        while(total2 > 500){
            System.out.println("Pon los atributos del JUGADOR 2: ");
            System.out.println("Elige la velocidad del JUGADOR 2: ");
            velocidad2 = in.nextInt();
            System.out.println("Elige el ataque del JUGADOR 2: ");
            ataque2 = in.nextInt();
            System.out.println("Elige la defensa del JUGADOR 2:");
            defensa2 = in.nextInt();
            System.out.println("Elige la vida del JUGADOR 2:");
            vida2 = in.nextInt();

            total2 = velocidad2 + ataque2 + defensa2 + vida2;

            if (total2>500 && velocidad2 <= 200 && velocidad2>0 && ataque2<=200 && ataque2>0 && defensa2<=200 && defensa2>0 && vida2<=200 && vida2>0){
                System.out.println("Datos incorrectos");
            }
        }

        if(velocidad1>velocidad2){
            if (vida1<=0 &&vida2<=0){
                System.out.println("Lo siento, has muerto");
            }
            System.out.println("JUGADOR 1 empieza el turno");

        }else {
            System.out.println("JUGADOR 2 empieza el turno");
        }

    }
}


