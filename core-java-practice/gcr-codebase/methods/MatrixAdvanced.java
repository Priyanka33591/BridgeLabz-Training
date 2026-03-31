public class MatrixAdvanced {

    // Create random matrix
    public static int[][] createRandomMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 5) + 1;
        return m;
    }

    // Transpose
    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    // Determinant 2x2
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant 3x3
    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    // Display int matrix
    public static void display(int[][] m) {
        for (int[] r : m) {
            for (int v : r)
                System.out.print(v + " ");
            System.out.println();
        }
    }

    // Display double matrix
    public static void display(double[][] m) {
        for (double[] r : m) {
            for (double v : r)
                System.out.printf("%.2f ", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] m2 = createRandomMatrix(2, 2);
        int[][] m3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        display(m2);
        System.out.println("Transpose:");
        display(transpose(m2));
        System.out.println("Determinant: " + determinant2x2(m2));
        System.out.println("Inverse:");
        display(inverse2x2(m2));

        System.out.println("\n3x3 Matrix:");
        display(m3);
        System.out.println("Transpose:");
        display(transpose(m3));
        System.out.println("Determinant: " + determinant3x3(m3));
    }
}
