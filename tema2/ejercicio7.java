import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        while(true){
            System.out.println("Dame un numero y te digo si es primo o no.");
            System.out.println("Si quieres salir escribe un 0");
            int numero = in.nextInt();
            if(numero == 0){
                System.out.println("Has salido");
                break;
            }if(numero<0){
                System.out.println("Dame un numero positivo");
            }else{
                if(primo(numero) || numero == 1){
                    System.out.println(numero + " es un numero primo.");
                }else{
                    System.out.println(numero + " no es un numero primo.");
                }
            }
        }
    }
    public static boolean primo(int numero){
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}