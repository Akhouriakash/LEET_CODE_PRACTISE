import java.util.*;

//  DUPLICATE NUMBER

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array (to easily remove duplicates)
        Arrays.sort(arr);

        // Count unique elements
        int j = 0; 
        int[] temp = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; // add last element

        // Copy unique elements into final array
        int[] uniqueArr = Arrays.copyOf(temp, j);

        // Print result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
