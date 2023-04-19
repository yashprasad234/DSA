package intro;

public class CalculateXRaisedToTheN {
    public static void main(String[] args) {
        System.out.println(optimizedPower(2,11));
    }

    static int power(int x, int n) {
        if(n == 0)
            return 1;
        return x*power(x, n-1);
    }

    static int optimizedPower(int x, int n) {
        if(n == 0)
            return 1;
        int ans = optimizedPower(x, n/2);
        if(n % 2 != 0)
            return x * ans * ans;
        return ans * ans;
    }
}
