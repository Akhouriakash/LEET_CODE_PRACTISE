//  Longest Common Prefix (LeetCode #14)

public class lcd {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Step 1: Take the first string as base
        String prefix = strs[0];

        // Step 2: Compare prefix with every other string
        for (int i = 1; i < strs.length; i++) {
            // While current word does not start with prefix, shrink prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"car", "cat", "can"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words));
    }
}
