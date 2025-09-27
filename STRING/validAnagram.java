package STRING;
// LEETCODE : 242  (VALID ANAGRAM)

import java.util.Scanner;

public class validAnagram {
    public boolean isAnagram(String s,String t){
        int[] charCounts = new int[26];
        
        // anagram

        // nagaram
        //[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]  26

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            charCounts[s.charAt(i)-'a']++;
            charCounts[t.charAt(i)-'a']--;
        }

        for(int i=0;i<charCounts.length;i++){
            if(charCounts[i] != 0){
                return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validAnagram obj = new validAnagram();

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = obj.isAnagram(s, t);
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }
}