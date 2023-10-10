import java.util.Random;
import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int loteria = random.nextInt(100000);

        for(int i = 0; i <= 5; i++){
            System.out.println("Dame un numero entre el 0 y el 99.999 p0ara poder ganar la loteria. Tienes 5 intentos:");
            int num1 = in.nextInt();
            if(num1 == loteria){
                System.out.println("wooohooo, has acertado campeon");
            }else{
                System.out.println("Lo siento, no has acertado");
            }

        }
        }
}



