public class ClearRangeOfBits {
    public static void main (String[] args) {
        System.out.println(clearRangeOfBits(2515,2,7));
    }

    static int clearRangeOfBits(int num, int i, int j) {
        int a = ((-1) << j+1);
        int b = (int) Math.pow(2,i) - 1;
        int bitMask = a | b;
        return num & bitMask;
    }
}
