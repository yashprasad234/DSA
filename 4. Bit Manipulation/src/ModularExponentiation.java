public class ModularExponentiation {
    public static void main(String[] args) {

    }

    static long power(long a, long n, long p) {
        //Just like fast exponentiation at every step instead of squaring we use modulo's property
        //(a * b) % n = ((a % n) * (b % n)) % n
        long ans = 1;
        while(n > 0) {
            if((n & 1) != 0)  {
                ans = ((a % p) * (n % p)) % p; //if p is greater than a than (a % p) can be replaced by a(only here)
            }
            a = ((a % p) * (a % p)) % p;
            n = n >> 1;
        }
        return ans;
    }
}
