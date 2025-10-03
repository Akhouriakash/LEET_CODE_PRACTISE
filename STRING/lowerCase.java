// LeetCode 709 — To Lower Case

import java.util.Scanner;

public class lowerCase {
    public String toLowerCase(String s) {
        return s.toLowerCase(); // built-in method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         lowerCase obj = new  lowerCase();

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = obj.toLowerCase(s);
        System.out.println("Converted to lowercase: " + result);

        sc.close();
    }
}
