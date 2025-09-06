    // LEETCODE : 121 -- Best Time to Buy and Sell Stock 
import java.util.Scanner;
public class buy_sell_stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);

        sc.close();
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // update min price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // update max profit
            }
        }
        return maxProfit;
    }
}
