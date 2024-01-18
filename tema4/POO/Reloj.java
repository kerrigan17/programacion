package POO;

public class Reloj {
    private int minuts;
    private static int hours;
    private int seconds;
    private final int PORDEFECTO = 0;


    public Reloj() {
        this.hours = PORDEFECTO;
        this.minuts = PORDEFECTO;
        this.seconds = PORDEFECTO;
    }

    public Reloj(int hours, int minuts, int seconds) {
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = seconds;
    }

    public Reloj(int hours, int minuts) {
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = PORDEFECTO;
    }

    int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            System.out.println("Tus parametros no pueden ser menor que 0, tus horas son 0");
        }
        if (hours >= 24) {
            hours -= 24;
        }
        hours = PORDEFECTO;
        this.hours = hours;
    }

    public static void compobarhours(int hours) {
        if (hours < 0) {
            System.out.println("Tus parametros no pueden ser menor que 0, tus horas son 0");
        }
        if (hours > 24) {
            hours -= 24;
        }
    }


    public static void comprobarminuts(int minuts, int hours) {
        if (minuts < 0 && minuts>60) {
            System.out.println("Tus parametros no pueden ser menor que 0, tus horas son 0");

        }
    }
    public static void comprobarseconds(int seconds) {
        if (seconds < 0) {
            System.out.println("Tus parametros no pueden ser menor que 0, tus horas son 0");
        }
    }
    public static void showhours(int hours, int minuts, int seconds){
        compobarhours(hours);
        comprobarminuts(minuts);
        comprobarseconds(seconds);
    }

}
    
