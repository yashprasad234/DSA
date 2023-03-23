import java.util.*;

public class Solution {
    public static void main(String[] args) {
        toh('A', 'B', 'C', 3);
    }

    static void toh(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println("1 from " + a + " to " + c);
            return;
        }
        toh(a, c, b, n-1);
        System.out.println(n + " from " + a + " to " + c);
        toh(b, a, c, n-1);
    }
}
