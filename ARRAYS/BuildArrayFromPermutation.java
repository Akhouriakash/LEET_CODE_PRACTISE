//  LeetCode 1920: Build Array from Permutation

import java.util.Scanner;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];  // main logic
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (permutation of 0 to n-1): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int[] ans = buildArray(nums, n);

        // Print result
        System.out.print("Resulting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
