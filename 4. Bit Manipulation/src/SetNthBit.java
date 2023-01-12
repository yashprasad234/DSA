public class SetNthBit {
    public static void main (String[] args) {
        System.out.println(setBit(9, 1));
    }

    static int setBit(int num, int n) {
        int bitMask = 1 << n;
        return num | bitMask;
    }
}
