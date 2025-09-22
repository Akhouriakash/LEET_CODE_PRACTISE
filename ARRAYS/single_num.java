import java.util.Scanner;
// LEETCODE : 136. Single Number

public class single_num {

    public int singleNum(int[] nums) {  // t.c : O(n) , s.c: O(1)
        int finder = 0;
        for (int i = 0; i < nums.length; i++) {
            finder ^= nums[i];
        }
        return finder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        single_num obj = new single_num();
        int result = obj.singleNum(nums);

        System.out.println("The single number is: " + result);

        sc.close();
    }
}
