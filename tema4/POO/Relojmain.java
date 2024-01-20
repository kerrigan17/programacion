package POO;

import java.util.Scanner;

public class Relojmain {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
      Reloj reloj = new Reloj();
      
      System.out.println("Ingresa la hora (0-23): ");
      int hours = in.nextInt();
      
      while (hours < 0 || hours >= 24) {
        System.out.println("La hora debe estar entre 0 y 23. Ingresa nuevamente la hora: ");
            hours = in.nextInt();
          }
          
        System.out.println("Ingresa los minutos (0-59): ");
        int minutes = in.nextInt();

        while (minutes < 0 || minutes >= 60) {
          System.out.println("Los minutos deben estar entre 0 y 59. Ingresa nuevamente los minutos: ");
            minutes = in.nextInt();
        }
        
        System.out.println("Ingresa los segundos (0-59): ");
        int seconds = in.nextInt();
        
        while (seconds < 0 || seconds >= 60) {
          System.out.println("Los segundos deben estar entre 0 y 59. Ingresa nuevamente los segundos: ");
          seconds = in.nextInt();
        }
        
        reloj.setHours(hours);
        reloj.setMinutes(minutes);
        reloj.setSeconds(seconds);

        System.out.println("La hora actual es: " + reloj.toString());
    }
}
