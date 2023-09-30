import java.util.Scanner;

public class ejercicio13 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame segundos: ");
        int seg = in.nextInt() + 1;
        System.out.println("Dame minutos: ");
        int min = in.nextInt();
        System.out.println("Dame horas: ");
        int hor = in.nextInt();

        seg ++;

        if (seg == 59){
                seg = 0;
                min ++;
                if( min == 60) {
                        min = 0;
                        hor ++;
                        if ( hor == 24){
                                hor ++;
                                hor = 0;

                        }
                }
        }

        System.out.println("Hora con un segundo más: " + hor + ":" + min + ":"+ seg );

        }
}