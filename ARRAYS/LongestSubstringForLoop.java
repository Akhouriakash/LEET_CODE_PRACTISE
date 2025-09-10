// Longest Substring Without Repeating Characters (LeetCode 3)

import java.util.Scanner;

public class LongestSubstringForLoop {

    public static int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[256]; // Track characters
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If current char already seen → shrink window from left
            while (seen[c]) {
                seen[s.charAt(left)] = false;
                left++;
            }

            // Mark current char as seen
            seen[c] = true;

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int result = lengthOfLongestSubstring(input);

        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
