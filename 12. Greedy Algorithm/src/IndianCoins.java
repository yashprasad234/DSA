public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,500,2000};
        System.out.println(minCoins(coins, 590));
    }

    static int minCoins(int[] coins, int v) {
        int count = 0, cap = v;
        for (int i = coins.length-1; i >= 0; i--) {
            if(cap >= coins[i]) {
                count += cap / coins[i];
                cap = cap % coins[i];
            }
        }
        return count;
    }
}
