package tema2;

import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un dia, un mes y un año te dire si es correcta o no.");
        System.out.println("Dame un dia:");
        int dia = in.nextInt();
        System.out.println("Dame un mes:");
        int mes = in.nextInt();
        System.out.println("Dame un año:");
        int anio = in.nextInt();
        if (fechaValida(dia, mes, anio)) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es una fecha correcta.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " no es una fecha correcta.");
        }
    }
    public static boolean fechaValida(int dia, int mes, int anio) {
        boolean esValido = true;
        
        if (anio < 1 || mes < 1 || mes > 12 || dia < 1) {
            esValido = false;
        } else {
            int maxDias = 0;

            if (mes == 2) {
                maxDias = esAnioBisiesto(anio) ? 29 : 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else {
                maxDias = 31;
            }

            if (dia > maxDias) {
                esValido = false;
            }
        }
        
        return esValido;
    }

    public static boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
