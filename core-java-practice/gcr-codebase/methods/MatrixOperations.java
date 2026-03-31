public class MatrixOperations {

    // Create random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10);
        return mat;
    }

    // Add matrices
    public static int[][] add(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    // Subtract matrices
    public static int[][] subtract(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    // Multiply matrices
    public static int[][] multiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // Display matrix
    public static void display(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = createRandomMatrix(2, 3);
        int[][] B = createRandomMatrix(2, 3);
        int[][] C = createRandomMatrix(3, 2);

        System.out.println("Matrix A:");
        display(A);
        System.out.println("Matrix B:");
        display(B);

        System.out.println("Addition:");
        display(add(A, B));

        System.out.println("Subtraction:");
        display(subtract(A, B));

        System.out.println("Multiplication (A x C):");
        display(multiply(A, C));
    }
}
