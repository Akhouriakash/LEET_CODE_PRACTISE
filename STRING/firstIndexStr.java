    // LeetCode 28: Find the Index of the First Occurrence in a String
    // T.C : o(n*m)  S.C: O(1)

import java.util.Scanner;

public class firstIndexStr {
    public int strStr(String haystack,String needle){
        for(int i=0;i<haystack.length()-needle.length()-1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                    if(j == needle.length() -1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the main string (haystack): ");
        String haystack = sc.nextLine();

        System.out.print("Enter the substring to find (needle): ");
        String needle = sc.nextLine();

        // Call method
        firstIndexStr obj = new firstIndexStr();
        int index = obj.strStr(haystack, needle);

        // Show result
        if (index != -1) {
            System.out.println("First occurrence at index: " + index);
        } else {
            System.out.println("Substring not found!");
        }

        sc.close();
    }
}
