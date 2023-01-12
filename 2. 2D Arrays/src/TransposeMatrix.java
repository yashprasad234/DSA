import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };
        for (int[] a: transpose(mat)) {
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] transpose (int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = mat[i][j];
            }
        }
        return ans;
    }
}
