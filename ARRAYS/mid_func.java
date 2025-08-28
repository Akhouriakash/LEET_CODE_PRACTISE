
import java.util.Scanner;
import java.util.Arrays;

public class mid_func {

    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return empty array if 2 or fewer elements
        }

        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];

        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        return middleArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] myArray = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            myArray[i] = sc.nextInt();
        }

        // Call middle function
        int[] result = middle(myArray);

        // Print result
        System.out.println("Middle elements: " + Arrays.toString(result));

        sc.close();
    }
}
