import java.util.Arrays;

public class SearchInRowColSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 39, 50}
        };
        int target = 33;
        System.out.println(Arrays.toString(searchInMatrix(mat, target)));
    }

    static int[] searchInMatrix(int[][] mat, int target) {
        int row = 0, col = mat[0].length-1;
        int[] ans = {-1, -1};
        while (row < mat.length && col >= 0) {
            if(mat[row][col] == target) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            } else if(mat[row][col] < target)
                row++;
            else
                col--;
        }
        return ans;
    }
}
