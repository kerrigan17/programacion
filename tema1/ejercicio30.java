import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("Dame un numero para la operacion");
            double numero1 = in.nextDouble();
            String op = in.toString();
            if (op.equals("q")) {
                continuar = false;
            } else {
                System.out.print("Ingrese un número: ");
                double numero2 = in.nextDouble();
                double resultado = 0.0;
                switch (op) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        break;
                    case "/":
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            System.out.println("ERROR");
                        }
                        break;
                    case "%":
                        if (numero2 != 0) {
                            resultado = numero1 % numero2;
                        } else {
                            System.out.println("ERROR");
                        }
                        break;

                }
            }


        }
    }
}
