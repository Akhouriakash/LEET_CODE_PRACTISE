// Valid Palindrome (LeetCode 125)

package RECURSION;

import java.util.Scanner;

public class palindrome {
    
    public static boolean isPalindrome(String str , int start , int end){
        if(start >= end)
            return true;
        
        return (str.charAt(start)==str.charAt(end)) && isPalindrome(str, start+1 , end-1); // O(n)

    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? " + result);
    }

}
