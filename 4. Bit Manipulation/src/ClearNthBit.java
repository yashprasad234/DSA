public class ClearNthBit {
    public static void main(String[] args) {
        System.out.println(clearNthBit(8, 3));
    }

    static int clearNthBit (int num , int n) {
        int bitMask = 1 << n;
        bitMask = ~bitMask;
        return num & bitMask;
    }
}
