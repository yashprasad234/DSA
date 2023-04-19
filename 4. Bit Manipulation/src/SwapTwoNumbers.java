public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 8;
        int y = 12;
        System.out.println("Before swap x = " + x + " and y = " + y);
        swap(x, y);
    }

    static void swap (int x, int y) {
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
        System.out.println("After swap x = " + x + " and y = " + y);
    }
}
