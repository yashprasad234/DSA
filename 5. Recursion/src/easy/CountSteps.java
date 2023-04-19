package easy;//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class CountSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(countSteps(n, 0));
    }

    static int countSteps(int n, int count) {
        if(n == 0)
            return count;
        if(n % 2 == 0)
            n /= 2;
        else
            n -= 1;
        count++;
        return countSteps(n, count);
    }
}
