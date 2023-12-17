package Tema3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMoscaMatriz {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);
    public static int[][] flyPositionCreate(){
        int[][] returnMatrizFly = new int [4][4];
        int lenght = 4;
        int FlyPositionFila = random.nextInt(4);
        int FlyPositionColumna = random.nextInt(4);
        returnMatrizFly[FlyPositionFila][FlyPositionColumna] = 1;
        System.out.println(Arrays.deepToString(returnMatrizFly));
        return returnMatrizFly;
    }
    public static void TurnCachFly (int[][] Matriz){
        int[][] FlyPosition = flyPositionCreate();
        boolean Victory = false;
        boolean adyacente = false;
        System.out.println("Donde crees que esta la mosca? ");

        while (!Victory){
            System.out.print("Selecciona la fila: ");
            int seleccionFila = in.nextInt();
            System.out.print("Selecciona la columna: ");
            int seleccionColumna = in.nextInt();
            if (seleccionFila > 3 || seleccionColumna > 3){
                System.out.println("Numero incorrecto, vuelve a elegir");
            }
            if( 1 == FlyPosition[seleccionFila][seleccionColumna]){
                System.out.println("Le has dado a la mosca!");
                Victory = true;
            } else {
                if (seleccionFila != 0 && FlyPosition[seleccionFila + 1][seleccionColumna] == 1){
                    if (seleccionFila == 3 && FlyPosition[seleccionFila - 1][seleccionColumna] == 1)

                        adyacente = true;
                } else if (seleccionFila != 3 && FlyPosition[seleccionFila - 1][seleccionColumna] == 1){
                    if (seleccionFila == 0 && FlyPosition[seleccionFila + 1][seleccionColumna] == 1)

                        adyacente = true;
                } else if (seleccionColumna != 0 && FlyPosition[seleccionFila][seleccionColumna + 1] == 1 ){
                    if (seleccionFila == 3 && FlyPosition[seleccionFila][seleccionColumna - 1] == 1)

                        adyacente = true;
                } else if (seleccionColumna != 3 && FlyPosition[seleccionFila][seleccionColumna - 1] == 1){
                    if (seleccionColumna == 0 && FlyPosition[seleccionFila][seleccionColumna + 1] == 1)

                        adyacente = true;
                } else if (seleccionFila != 0 && seleccionFila != 3 && seleccionColumna != 0 && seleccionColumna != 3){
                    if (FlyPosition[seleccionFila +1][seleccionColumna +1] == 1 && FlyPosition [seleccionFila - 1][seleccionColumna + 1] == 1){
                        adyacente = true;
                    }
                }
                if (adyacente){
                    System.out.println("Has estado a punto de darle a la mosca");
                    FlyPosition = flyPositionCreate();
                } else {
                    System.out.println("Vuelve a intentarlo");
                }
            }
        }
        Arrays.deepToString(FlyPosition);
    }
    public static void main (String[] args){
        System.out.println("Este es el juego de la mosca con una matriz!");
        int[][] FlyMatriz = flyPositionCreate();
        TurnCachFly(FlyMatriz);
    }

}
