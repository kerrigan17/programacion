public class ejercicio9{
    public static void main(String[] args) {
        mostrarTriangulo('a', 4);
    }

    public static void mostrarTriangulo(char caracter, int numLineas) {
        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= numLineas - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(caracter);
            }
            System.out.println();  
        }
    }
}