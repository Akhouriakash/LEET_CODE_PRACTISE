import java.util.Scanner;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        // Step 1: calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        // Step 2: check pivot index
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i; // pivot found
            }
            leftSum += nums[i]; // update left sum
        }
        // Step 3: no pivot found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int pivot = pivotIndex(nums);

        // Output result
        if (pivot != -1) {
            System.out.println("Pivot index is: " + pivot);
        } else {
            System.out.println("No pivot index found.");
        }

        sc.close();
    }
}
