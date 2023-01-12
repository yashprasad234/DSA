import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        System.out.println(Arrays.toString(search(mat, 30)));
    }

    static int[] search(int[][] mat, int target) {
        int[] ans = {-1,-1};
        int row = mat.length-1, col = 0;
        while (col < mat[0].length && row >= 0) {
            if(mat[row][col] > target)
                row--;
            else if(mat[row][col] < target)
                col++;
            else {
                ans[0] = row;
                ans[1] = col;
                break;
            }
        }
        return ans;
    }
}
