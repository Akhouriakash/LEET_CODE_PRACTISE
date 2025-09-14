import java.util.Scanner;

public class runningSum1D {

    public static int[] runningSum(int[] nums) {
        if (nums == null) return null;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int[] result = runningSum(nums);

        System.out.print("Running sum array: ");
        for (int v : result) System.out.print(v + " ");
        System.out.println();
        sc.close();
    }
}
