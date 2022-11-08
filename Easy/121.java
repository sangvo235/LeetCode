class Solution {
    public static int maxProfit(int[] prices) {

        int max_profit = Integer.MAX_VALUE;
        int outcome = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < max_profit) {
                max_profit = prices[i];
            }

            profit = prices[i] - max_profit;

            if (outcome < profit) {
                outcome = profit;
            }
        }
        return outcome;

    }

    // Testing prices = [7,1,5,3,6,4]
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}