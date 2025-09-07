//  LeetCode 283 – Move Zeroes
import java.util.Scanner;

public class move_zeroes {

    // Function to move zeroes to the end
    public static void moveZeroes(int[] nums) {
        int i = 0; // position for placing the next non-zero number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        // Call function
        moveZeroes(nums);

        // Print result
        System.out.print("Array after moving zeroes: ");
        for (int num : nums) System.out.print(num + " ");
    }
}
