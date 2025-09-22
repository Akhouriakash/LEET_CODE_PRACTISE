// leetcode : 217 // Contains duplicate
import java.util.HashSet;
import java.util.Scanner;

public class contains_duplic {
    public static  boolean con_dupli(int[] nums){
        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
    return false;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = s.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) nums1[i] = s.nextInt();

         boolean nu =con_dupli(nums1);
        System.out.println(nu);
        s.close();


    }
}
