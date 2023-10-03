import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Si quieres de euros a dolares escribe D; y si quieres dolares a euros escribe E");
        char de = in.next().charAt(0);
        System.out.println("¿Cuánto dinero?");
        double dinero = in.nextInt();

        if (de =='D'){
            double dolares = dinero * 1.06;
            System.out.println(de + " euros, son " + dolares);
        }if (de == 'E'){
            double euros = dinero * 0.95;
            System.out.println(de + " dolares, son " + euros);

        }else{
            System.out.println("Tienes que poner 'D' o 'E'.");
            
        }
    }
}
