import java.util.Scanner;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;   // last valid index in nums1
        int j = n - 1;   // last index in nums2
        int k = m + n - 1; // last index in nums1 (full length)

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining nums2 elements if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nums1 input
        System.out.print("Enter size of nums1 (m+n): ");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];

        System.out.print("Enter number of valid elements in nums1 (m): ");
        int m = sc.nextInt();

        System.out.println("Enter " + m + " sorted elements for nums1:");
        for (int i = 0; i < m; i++) nums1[i] = sc.nextInt();

        // nums2 input
        System.out.print("Enter size of nums2 (n): ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];

        System.out.println("Enter " + n + " sorted elements for nums2:");
        for (int i = 0; i < n; i++) nums2[i] = sc.nextInt();

        // Call merge
        merge(nums1, m, nums2, n);

        // Print result
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
