package tema3.arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class AtrapaLaMosca {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static int[] flyPositionCreate() {
        int[] returnArrayFly = new int[15];
        int length = 15;
        int flyPosition = random.nextInt(0, 15);
        for (int i = 0; i < length; i++) {
            if (flyPosition == i) {
                returnArrayFly[i] = 1;
            } else {
                returnArrayFly[i] = 0;
            }
        }
        System.out.println(Arrays.toString(returnArrayFly));
        return returnArrayFly;
    }

    public static void TurnCatchTheFly(int[] Array) {
        int[] FlyPositionArray = flyPositionCreate();
        boolean Victory = false;
        System.out.println("Donde crees que esta la mosca?");
        while (Victory == false) {
            int eleccion = in.nextInt();
            if (eleccion > 14 || eleccion < 0) {
                System.out.println("Numero incorrecto, vuelve a elegir");
            }
            if (1 == FlyPositionArray[eleccion]) {
                System.out.println("Le has dado a la mosca");
                Victory = true;
            } else {
                if (eleccion == 14){
                   if  ( 1 == FlyPositionArray[eleccion - 1]) {
                       System.out.println("Has estado a punto de darle a la mosca");
                       FlyPositionArray = flyPositionCreate();
                   }else{
                       System.out.println("Vuelve a intentarlo");
                       Arrays.toString(FlyPositionArray);
                   }
                }
                if (eleccion == 0){
                    if  ( 1 == FlyPositionArray[eleccion + 1]) {
                        System.out.println("Has estado a punto de darle a la mosca");
                        FlyPositionArray = flyPositionCreate();
                    } else {
                        System.out.println("Vuelve a intentarlo");
                        Arrays.toString(FlyPositionArray);
                    }
                }
                if (eleccion != 0 && eleccion != 14){
                    if (1 == FlyPositionArray[eleccion + 1] || 1 == FlyPositionArray[eleccion - 1]) {
                        System.out.println("Has estado a punto de darle a la mosca");
                        FlyPositionArray = flyPositionCreate();
                    } else{
                        System.out.println("Vuelve a intentarlo");
                        Arrays.toString(FlyPositionArray);
                    }
                }
            }
            Arrays.toString(FlyPositionArray);
        }
    }
    public static void main(String[] args) {
        System.out.println("Bienvenido/a al juego de la mosca " +
                "\nEn este juego tendras que elegir un numero de entre el 0 y el 15," +
                "\nsi el numero que elejiste esta cerca de la mosca esta se movera de posicion," +
                "\ny si no lo esta la mosca permanecera en su sitio. Buena suerte!");
        System.out.print("Introduce next para continuar :");
        String next = in.nextLine();

        int[] FlyArray = flyPositionCreate();
        TurnCatchTheFly(FlyArray);

    }
}
