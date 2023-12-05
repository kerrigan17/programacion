import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;


public class buscaminas {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    static String[] Posiciones =  {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"};
    static String[] eleccion = {"*","*","*","*","*","*","-","-","-","-","-","-","-","-","-","-","-","-","-","-",};
    static int libre = 14;


    public static void CambiarPosicion() {
        for (int i = 0; i < 100; i++) {
            int num1 = random.nextInt(20);
            int num2 = random.nextInt(20);
            if (num1 != num2) {
                String orden1 = eleccion[num1];
                String orden2 = eleccion[num2];
                eleccion[num1] = orden2;
                eleccion[num2] = orden1;
            }
        }
    }


    public static int Buscaminas(int numero) {
        if (eleccion[numero].equals("*")) {
            System.out.println("En esa posicion habia una mina " + numero);
            return 4;
        } else if (eleccion[numero].equals("0")) {
            int contador = 1;

            if (numero > 0 && eleccion[numero - 1].equals("*")) {
                contador++;
            }
            if (numero < eleccion.length - 1 && eleccion[numero + 1].equals("*")) {
                contador++;
            }
            return contador;
        }
        return 0;
    }


    public static void main(String[] args) {
        CambiarPosicion();


        while (libre > 0) {
            System.out.println(Arrays.toString(eleccion));
            System.out.println(Arrays.toString(Posiciones));
            System.out.println("Dime el lugar ");
            int numero = in.nextInt();
            int contador = Buscaminas(numero);


            if (contador == 4) {
                Posiciones[numero] = "*";
                break; //
            } else if (contador == 2) {
                Posiciones[numero] = "1";
                libre--;
            } else if (contador == 3) {
                Posiciones[numero] = "2";
                libre--;
            }else if (contador == 1)
                Posiciones[numero] = "0";
                libre--;
            if (libre == 0) {
                System.out.println("Has ganado");
            }
        }


        System.out.println(Arrays.toString(Posiciones));


    }
}

