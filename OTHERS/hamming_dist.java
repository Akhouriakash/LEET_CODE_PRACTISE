
package OTHERS;

import java.util.Scanner;

public class hamming_dist {
    public static int haming_distance(int x, int y) {
        int a = 1;
        int counter = 0;
        for (int i = 0; i < 32; i++) {
            if (((x ^ y) & a) != 0) {   // T.C: O(32), S.C: O(1)
                counter++;
            }
            a <<= 1;
        }
        return counter;
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter second number (y): ");
        int y = sc.nextInt();

        int result = haming_distance(x, y);

        System.out.println("The Hamming Distance between " + x + " and " + y + " is: " + result);

        sc.close();
    }
}
