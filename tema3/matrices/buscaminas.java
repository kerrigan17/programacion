package matrices;

public class buscaminas {
    public static void main(String[] args) {
        char [][] tablero = new char[10][10];

        for (int fila = 0; fila < 10; fila++){
            for(int col = 0; col <10; col++){
                tablero[fila][col]= '-';
            }
        }
        mostrarTablero(tablero);
    }
    public static void mostrarTablero(char[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int col = 0; col < tablero[fila].length; col++) {
                System.out.print(tablero[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
