public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(power(3,5));
    }

    static int power(int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) == 1) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }
}
