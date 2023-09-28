import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de un mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Introduce un año: ");
        int año = scanner.nextInt();

        int diasEnMes = obtenerDiasEnMes(mes, año);

        if (diasEnMes == -1) {
            System.out.println("Entrada inválida. El número de mes debe estar entre 1 y 12.");
        } else {
            System.out.println("Número de días en el mes " + mes + " del año " + año + ": " + diasEnMes);
        }

        scanner.close();
    }

    public static int obtenerDiasEnMes(int mes, int año) {
        if (mes < 1 || mes > 12) {
            return -1; // Valor de retorno inválido para indicar entrada incorrecta
        }

        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}
