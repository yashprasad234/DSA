package easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(productOfDigits(n));
    }

    static int productOfDigits(int n) {
        if(n == 1)
            return 1;
        return (n % 10) * productOfDigits(n/10);
    }
}
