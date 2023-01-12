public class ClearLastNBits {
    public static void main(String[] args) {
        System.out.println(clearNBits(15, 2));
    }

    static int clearNBits(int num , int n) {
        int bitMask = ((-1) << n);
        return num & bitMask;
    }
}
