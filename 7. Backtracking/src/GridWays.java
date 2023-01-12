public class GridWays {
    public static void main(String[] args) {
        System.out.println(gridWaysOptimized(4,4));
    }

    static int gridWays(int i, int j, int m, int n) {
        if(i == m-1 && j == n-1) {
            return 1;
        } else if(i == m || j == n)
            return 0;

        return gridWays(i+1, j, m, n) + gridWays(i, j+1, m, n);
    }

    //Optimised using permutation

    static int gridWaysOptimized(int m, int n) {
        int num = fact(m+n-2);
        int den = fact(m-1);
        den *= fact(n-1);
        return num / den;
    }

    static int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        int ans = 1;
        for (int i = 2; i <= n; i++)
            ans *= i;
        return ans;
    }
}
