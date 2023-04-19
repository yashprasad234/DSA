package easy;

public class PalindromeCheck {
    public static void main(String[] args) {
        int n = 1213;
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n) {
        return (n == reverse(n,0));
    }

    static int reverse(int n, int rev) {
        if(n == 0)
            return rev;
        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n / 10, rev);
    }
}
