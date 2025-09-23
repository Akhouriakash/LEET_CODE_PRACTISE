import java.util.Scanner;
public class rotate_mg {
    // LEETCODE : 48 ROTATE IMAGE (90° clockwise)

    public static void rotate_img(int[][] matrix){
       // Transpose 2D matrix
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // After transposing , we must reverse each individually in the matrix

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-j-1] = temp; 
            }
        }

        // [[1,2,3],
        //  [4,5,6],
        //  [7,8,9]]

        // [[7,4,1],
        //  [8,5,2],
        //  [9,6,3]]

        // Time complexity : O(n^2)
        // space complexity :O(n)
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

        // Create object and rotate
       rotate_mg obj = new rotate_mg();
        obj.rotate_img(matrix);

        // Print rotated matrix
        System.out.println("Rotated Matrix (90° clockwise):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}