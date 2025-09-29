import java.util.Scanner;

public class validPalind {
    public boolean isPalindrome(String s){
        String newStr = "";

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newStr += s.charAt(i);
            }
        }

        newStr = newStr.toLowerCase();

        for(int i=0;i<newStr.length()/2;i++){
            if(newStr.charAt(i) != newStr.charAt(newStr.length()-i-1)){
                return false;
            }
        }
        return true;

        // t.c: O(n)
        // s.c: O(n)

        // "racecar" // if(s.charAt(i) == s.charAt(s.length-i-1))
 
    }



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validPalind obj = new validPalind();

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = obj.isPalindrome(s);
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}

