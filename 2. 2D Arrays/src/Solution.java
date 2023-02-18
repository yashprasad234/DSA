import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };
        for (int[] a: transpose(mat)) {
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] transpose(int[][] a) {
        int[][] ans = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                ans[j][i] = a[i][j];
            }
        }
        return ans;
    }
}
