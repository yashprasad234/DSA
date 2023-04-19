public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n, 0));
    }

    static int reverse(int n, int rev) {
        if(n == 0)
            return rev;
        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n / 10, rev);
    }
}
