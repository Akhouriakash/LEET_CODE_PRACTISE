
import java.util.Scanner;

public class sum_of_diag {

    // Method to calculate sum of diagonal elements
    public static int sumDiagonalElements(int[][] array) {
        int n = array.length;   // number of rows (matrix is square, so rows = columns)
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element (row == col)
            sum += array[i][i];
        }

        return sum; // return the final sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take matrix size
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] myArray2D = new int[n][n];

        // Step 2: Take user input for matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                myArray2D[i][j] = sc.nextInt();
            }
        }

        // Step 3: Print the matrix (for clarity)
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray2D[i][j] + " ");
            }
            System.out.println();
        }

        // Step 4: Call method and print result
        int result = sumDiagonalElements(myArray2D);
        System.out.println("Sum of primary diagonal elements = " + result);

        sc.close();
    }
}
