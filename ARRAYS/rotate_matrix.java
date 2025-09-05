
import java.util.Scanner;
// LEETCODE : 48
public class rotate_matrix  {

    // Function to rotate the matrix by 90 degrees (clockwise)
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter N for NxN matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Matrix after 90-degree rotation:");
        printMatrix(matrix);

        sc.close();
    }
}
