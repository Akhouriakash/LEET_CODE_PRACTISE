package OTHERS;

import java.util.Scanner;

public class missing_number {
    public int missing_num(int[] num) {
        int missing = 0;

        for (int i = 0; i < num.length; i++) {
            missing = (missing ^ i ^ num[i]);
        }
        return missing ^ num.length;

        // Time complexity: O(n)
        // Space complexity: O(1)
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input size
        System.out.print("Enter the size of array (n): ");
        int n = s.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (from 0 to " + n + " but one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        missing_number obj = new missing_number();
        int result = obj.missing_num(nums);

        System.out.println("The missing number is: " + result);

        s.close();
    }
}

/*  int numSum = 0;
    int totalSum =0;
    for(int i=0;i<num.length;i++){
    numSum+=num[i];
    }

    for(int i=0;i<=num.length;i++){
    totalSum += i;
    }
    return totalSum-numSum;

    // t.c: O(2n)
    // s.c: O(1)

*/