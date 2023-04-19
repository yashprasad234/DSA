package easy;

public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sumOfN(10));
    }

    static int sumOfN(int n) {
        if(n == 1)
            return 1;
        return n+sumOfN(n-1);
    }
}
