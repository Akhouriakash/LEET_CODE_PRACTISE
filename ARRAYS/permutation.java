
import java.util.Arrays;
import java.util.Scanner;
public class permutation {
    
    public boolean permuTation(int[] array1, int[] array2) {
        // If lengths are different, they cannot be permutations
        if (array1.length != array2.length) {
            return false;
        }
        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
        // Compare arrays
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        permutation ex = new permutation();

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        // Check permutation
        boolean result = ex.permuTation(array1, array2);
        System.out.println("Are the arrays permutation of each other? " + result);

        sc.close();
    }
}
