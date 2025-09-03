 // IsUnique / Contains Duplicate - LeetCode 217
import java.util.*;

public class isUnique {
    public static boolean IsUnique(int[] nums) {
        Arrays.sort(nums);  // sort the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return false; // duplicate found
            }
        }
        return true; // all unique
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (IsUnique(arr)) {
            System.out.println("Array is Unique (No Duplicates).");
        } else {
            System.out.println("Array contains Duplicates.");
        }
    }
}
