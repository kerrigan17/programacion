import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HundirLaFlota {
    static int rows = 11;
    static int columns = 11;
    static char[][] board;
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        createBoard();
        printBoard(placeShips());
        battleTurn();
    }

    public static char[][] createBoard() {
        board = new char[rows][columns];
        int letterValue = 65;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i > 0 && j == 0) {
                    char num = (char) (i - 1 + '0');
                    board[i][j] = num;
                } else if (i == 0 && j > 0) {
                    char letter = (char) letterValue;
                    board[i][j] = letter;
                    letterValue++;
                } else {
                    board[i][j] = '-';
                }
            }
        }
        board[0][0] = ' ';
        return board;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static char[][] placeShips() {
        int shipsPlaced = 0;
        do {
            rows = random.nextInt(1, 10);
            columns = random.nextInt(1, 10);
            if (board[rows][columns] == '-') {
                board[rows][columns] = 'S';
                shipsPlaced++;
            }
        } while (shipsPlaced < 10);
        return board;
    }

    public static void battleTurn() {
        boolean victory = false;
        int attempts = 50;
        while (!victory && attempts > 0) {
            System.out.print("Introduce la fila (0 - 9): ");
            int selectedRow = in.nextInt() + 1;
            System.out.print("Introduce la columna (A - J): ");
            char selectedColumn = in.next().charAt(0);

            int convertedColumn = convertLetterToNumber(selectedColumn);
            if (board[selectedRow][convertedColumn] == 'S') {
                System.out.println("Le diste a un barco!");
                board[selectedRow][convertedColumn] = 'X';
            } else {
                System.out.println("Diste en el agua!");
                board[selectedRow][convertedColumn] = 'A';
            }
            printBoard(board);

            attempts--;
            if (remainingShips() == 0) {
                System.out.println("ENHORABUENA");
                System.out.println("Hundiste todos los barcos!");
                victory = true;
            }
        }
    }

    public static int remainingShips() {
        int counter = 0;
        for (int x = 1; x < board.length; x++) {
            for (int y = 1; y < board.length; y++) {
                if (board[x][y] == 'S') {
                    counter++;
                }
            }
        }
        return counter;
    }


    public static int convertLetterToNumber(char column) {
        int convertedColumn;
        switch (column) {
            case 'A':
                convertedColumn = 1;
                break;
            case 'B':
                convertedColumn = 2;
                break;
            case 'C':
                convertedColumn = 3;
                break;
            case 'D':
                convertedColumn = 4;
                break;
            case 'E':
                convertedColumn = 5;
                break;
            case 'F':
                convertedColumn = 6;
                break;
            case 'G':
                convertedColumn = 7;
                break;
            case 'H':
                convertedColumn = 8;
                break;
            case 'I':
                convertedColumn = 9;
                break;
            case 'J':
                convertedColumn = 10;
                break;
            default:
                convertedColumn = -1; // O cualquier valor que desees para indicar un valor inválido
                break;
        }
        return convertedColumn;
    }
}