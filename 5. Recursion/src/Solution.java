import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(132, 0));
    }

    static int reverse (int n, int ans) {
        if(n == 0)
            return ans;
        ans = ans * 10 + n % 10;
        return reverse(n / 10, ans);
    }
}
