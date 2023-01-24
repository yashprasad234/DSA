public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > buy) {
                profit = Math.max(profit, (prices[i] - buy));
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
}
