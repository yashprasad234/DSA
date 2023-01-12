public class CheckForPowerOfTwo {
    public static void main(String[] args) {
        int n = 25600;
        if(isPowerOfTwo(n))
            System.out.println(n + " is a power of two");
        else
            System.out.println(n + " is not a power of two");
    }

    static boolean isPowerOfTwo (int num) {
        int bitmask = num - 1;
        return (num & bitmask) == 0;
    }
}
