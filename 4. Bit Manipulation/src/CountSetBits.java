public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }

    static int countSetBits(int num) {
        int count = 0;
        while(num > 0) {
            if((num & 1) == 1)
                count++;
            num = num >> 1;
        }
        return count;
    }
}
