import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        System.out.println(Arrays.toString(searchInMatrix(mat, 29)));
    }

    static int[] searchInMatrix(int[][] mat, int target) {
        int i = 0, j = mat[0].length-1;
        int[] ans = {-1,-1};
        while (i < mat.length && j >= 0) {
            if(mat[i][j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            else if(mat[i][j] > target)
                j--;
            else
                i++;
        }
        return ans;
    }
}
