/*package matrices;
public class matrices {
    private int[][] matrix;
    private int rows;
    private int cols;

    public void MyMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    public void printMatrix() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public int maxValue() {
        int maxVal = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                maxVal = Math.max(value, maxVal);
            }
        }
        return maxVal;
    }

    public int minValue() {
        int minVal = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                minVal = Math.min(value, minVal);
            }
        }
        return minVal;
    }

    public double meanValue() {
        int total = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                total += value;
            }
        }
        return (double) total / (rows * cols);
    }

    public boolean elementExists(int element) {
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == element) {
                    return true;
                }
            }
        }
        return false;
    }

    public int countOccurrences(int element) {
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == element) {
                    count++;
                }
            }
        }
        return count;
    }

    public MyMatrix addMatrices(MyMatrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.cols != otherMatrix.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }
        return new MyMatrix(result);
    }

    public MyMatrix subtractMatrices(MyMatrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.cols != otherMatrix.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] - otherMatrix.matrix[i][j];
            }
        }
        return new MyMatrix(result);
    }

    public boolean isIdentityMatrix() {
        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrixData = {{1, 0, 0, 0},{0, 1, 0, 0},{0, 0, 1, 0},{0, 0, 0, 1}
        };

        MyMatrix matrix = new MyMatrix(matrixData);

        matrix.printMatrix();
        System.out.println("Máximo: " + matrix.maxValue());
        System.out.println("Mínimo: " + matrix.minValue());
        System.out.println("Media: " + matrix.meanValue());
        System.out.println("¿Existe el elemento 2? " + matrix.elementExists(2));
        System.out.println("Repeticiones de 1: " + matrix.countOccurrences(1));
    }
}
*/