
import java.util.Scanner;

public class Rotate_Matrixx {

    // Rotate 90° Clockwise
    public static void rotateClockwise(int[][] matrix) {
        // Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = temp;
            }
        }
    }

    // Rotate 90° Anti-Clockwise
    public static void rotateAntiClockwise(int[][] matrix) {
        // Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each column
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length / 2; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i - 1][j] = temp;
            }
        }
    }

    // Print helper
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.print("\nEnter 1 for Clockwise, 2 for Anti-Clockwise: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            rotateClockwise(matrix);
            System.out.println("\nMatrix after 90° Clockwise Rotation:");
            printMatrix(matrix);
        } else if (choice == 2) {
            rotateAntiClockwise(matrix);
            System.out.println("\nMatrix after 90° Anti-Clockwise Rotation:");
            printMatrix(matrix);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
