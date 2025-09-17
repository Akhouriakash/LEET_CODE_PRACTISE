import java.util.Scanner;

        //   Maximum Subarray (LeetCode 53)

public class MajorityElement {
    
    public static int majorityBruteForce(int[] nums) {  // O(n^2)
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) count++;
            }
            if (count > n / 2) return nums[i];
        }
        return -1;
    }

       // Boyer-Moore Voting Algorithm using standard for loop
    public static int majorityBoyerMoore(int[] nums) {  // O(n)
        int candidate = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // pick element at index i

            if (count == 0) {
                candidate = num;  // choose new candidate
            }

            if (num == candidate) {
                count++;          // support current candidate
            } else {
                count--;          // cancel a vote
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Take array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call Boyer-Moore algorithm
        int majority = majorityBoyerMoore(nums);

        System.out.println("Majority Element is: " + majority);
    }
}


/*    nums = [1, 2, 33, 4, 5]
n = 5

➡️ No element appears 3 or more times → No majority element exists.

But ⚠️ on LeetCode 169, they always guarantee that a majority element exists.
So if you give an input where no majority exists, the Boyer–Moore algorithm will still return some candidate, but it’s not meaningful.

Since there’s no true majority element in this array, Boyer–Moore’s result is not valid.
It just gives the last standing candidate (5 here).


*/