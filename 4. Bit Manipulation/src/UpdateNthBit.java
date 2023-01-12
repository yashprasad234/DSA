public class UpdateNthBit {
    public static void main(String[] args) {
        System.out.println(updateNthBit(5, 1, 1));
    }

    static int updateNthBit (int num, int n, int bit) {
        if(bit == 1)
            return setNthBit(num, n);
        else
            return clearNthBit(num, n);
    }

    static int clearNthBit(int num , int n) {
        int bitMask = ~(1 << n);
        return num & bitMask;
    }

    static int setNthBit(int num, int n) {
        int bitMask = 1 << n;
        return num | bitMask;
    }
}
