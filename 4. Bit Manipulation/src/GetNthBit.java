public class GetNthBit {
    public static void main (String[] args) {
        System.out.println(nthBit(10,3));
    }

    static int nthBit(int a, int n) {
        int bitMask = 1 << n;
        if((a & bitMask) == 0)
            return 0;
        else
            return 1;
    }
}
