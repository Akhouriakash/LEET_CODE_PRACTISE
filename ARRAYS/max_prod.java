import java.util.Scanner;

public class max_prod {

    // Function to find max product pair
    public static void maxProduct(int[] arr) {
        int firstMax = 0, secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Max product pair is: (" + firstMax + ", " + secondMax + ")");
        System.out.println("Maximum product = " + (firstMax * secondMax));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call special function
        maxProduct(arr);

        sc.close();
    }
}
