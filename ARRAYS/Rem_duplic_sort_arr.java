import java.util.Scanner;
// LLETCODE : 26

public class Rem_duplic_sort_arr {
    
    // Method to remove duplicates from a sorted array
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // If empty array, return 0

        int i = 0; // pointer for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // Found a new unique number
                i++;
                nums[i] = nums[j];   // Move it forward
            }
        }
        return i + 1; // New length of unique array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // 2. Input elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Call function
        Rem_duplic_sort_arr obj = new Rem_duplic_sort_arr();
        int newLength = obj.removeDuplicates(arr);

        // 4. Print unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
