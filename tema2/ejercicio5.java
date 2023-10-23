import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un nnumero entero entre el 1 y el 10: ");
        int numero = in.nextInt();
        if (numero>0 && numero<10){
            tabla(numero);
        }
        
    }
    public static void tabla(int numero) {
        System.out.println("La tabla de mulplicar del numero "+ numero + " es:");
        for (int i = 0; i < 11; i++){
            System.out.print(numero + " x " + i + " = ");
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }
}