public class CountZeroes {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(count0(n, 0));
    }

    static int count0(int n, int count) {
        if(n == 0)
            return count;
        if(n % 10 == 0)
            count++;
        return count0(n / 10, count);
    }
}
