// Product of Array Except Self (LeetCode 238)

import java.util.Scanner;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: prefix products
        answer[0] = 1;  // nothing before first element
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: suffix product (in one variable)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // function call
        int[] result = productExceptSelf(nums);

        // output
        System.out.print("Product array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
    }
}
