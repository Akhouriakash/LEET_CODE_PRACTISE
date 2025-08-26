// LEETCODE : 190 REVERSE BITS

package OTHERS;
import java.util.Scanner;

public class reverse_bits {

    public int rev_bits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) != 0) {
                result += 1;
            }
            n >>= 1;
        }
        return result;

        // Time complexity: O(32)
        // Space complexity: O(1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverse_bits obj = new reverse_bits();

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int reversed = obj.rev_bits(num);
        System.out.println("Reversed bits output: " + reversed);
       System.out.println("Reversed bits output: " + Integer.toUnsignedLong(reversed));

        sc.close();
    }
}
