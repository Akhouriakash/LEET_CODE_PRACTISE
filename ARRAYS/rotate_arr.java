// LEETCODE : 189 ROTATE ARRAY

import java.util.Scanner;


public class rotate_arr {
  
    // Function to rotate array by k steps
    public void rotate_array(int nums[], int k) {
        int n = nums.length;
        k = k % n;   // handle large k

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse subarray
    public void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Main function with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        // Input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k (rotation steps): ");
        int k = sc.nextInt();

        // Rotate
        rotate_arr obj = new rotate_arr();
        obj.rotate_array(nums, k);

        // Print rotated array
        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

