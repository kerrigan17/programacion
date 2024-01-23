package tema3.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class WifiRouter {
    static int habitacionesNum = 20;
    static int[] ArrayRouter = new int[habitacionesNum];
    static int PotenciaRouter = 6;
    public static void ComprobacionRouter(int[] ArrayRouter, int numeroHabitacion, int PotenciaRouter) {
        int HabitacionSubir = numeroHabitacion;
        int HabitacionBajar = numeroHabitacion;
        ArrayRouter[numeroHabitacion] = PotenciaRouter;
        for (int i = 0; i < PotenciaRouter; PotenciaRouter--) {
           if (numeroHabitacion + i >= 0){
                if (HabitacionSubir < 20){
                    ArrayRouter[HabitacionSubir] = PotenciaRouter;
                }
           }
           if(numeroHabitacion - i <= numeroHabitacion) {
               if (HabitacionBajar >= 0){
                   ArrayRouter[HabitacionBajar] = PotenciaRouter;
               }
           }
           HabitacionBajar --;
           HabitacionSubir ++;
        }
        System.out.println(Arrays.toString(ArrayRouter));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la habitacion en la cual desee ver la potencia del router :");
        int numeroHabitacion = in.nextInt();
        ComprobacionRouter(ArrayRouter,numeroHabitacion,PotenciaRouter);
    }
}
