import java.util.Scanner;

import javax.swing.text.Style;

public class ejercico24 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int aprobado = 0;
        int suspendido = 0;
        int alumno = 0;

        while(true){
            System.out.println("Dame las notas, para salir, escribe un numero negativo:");
            int nota = in.nextInt();
            if(nota <= -1){
                break;
            }
            if(nota>=0 && nota <=10){
                if(nota<5){
                suspendido ++;
                alumno++;
                }
                if(nota>=5){
                aprobado++;
                alumno ++;
                }
            }else{
                System.out.println("Dame una nota del 1 al 10");
            }
        }
        System.out.println("De " + alumno + " alumnos, hay " + aprobado + " aprobados y " + suspendido +" suspendidos." );

    }
}
