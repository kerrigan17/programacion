import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Si quieres de euros a dolares escribe D y si quieres dolares a euros escribe E");
        int de = in.nextInt();
        System.out.println("¿Cuánto dinero?");
        int dinero = in.nextInt();

        double dolares = dinero * 1.06;
        double euros = dinero * 0.95; 

        if (de == D){
            System.out.println(de + " euros, son " + dolares);
        }if (de == E){
            System.out.println(de + " dolares, son " + euros);

        }else{
            System.out.println("Tienes que poner 'D' o 'E'.")
            
        }
    }
}
