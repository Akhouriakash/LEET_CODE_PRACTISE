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


/*
 import java.util.Scanner;

public class PalindromeRecursion {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String s, int left, int right) {
        // Base case: if left >= right, it's a palindrome
        if (left >= right) {
            return true;
        }

        // Skip non-alphanumeric characters
        if (!Character.isLetterOrDigit(s.charAt(left))) {
            return isPalindrome(s, left + 1, right);
        }
        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return isPalindrome(s, left, right - 1);
        }

        // Compare characters (ignoring case)
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        // Move inward
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? " + result);
    }
}

 */

 /*
  import java.util.Scanner;

public class SimplePalindromeRecursion {

    // Recursive function
    public static boolean isPalindrome(String s, int left, int right) {
        // Base case: crossed over → palindrome
        if (left >= right) {
            return true;
        }

        // If mismatch → not palindrome
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Move inward
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? " + result);
    }
}

  */