package POO;

import java.util.Scanner;

public class Relojmain{
private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Reloj hora = new Reloj();

        System.out.println("Dame las horas");
        int hours = in.nextInt();
        System.out.println("Dame los minutos");
        int minuts = in.nextInt();
        System.out.println("Dame los segundos");
        int seconds= in.nextInt();


        hora.setHours(hours);
        hora.setMinuts(minuts);
        hora.setSeconds(seconds);

        Reloj.showhours();



    }
}
