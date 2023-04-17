import java.util.Arrays;

public class SearchInRowWiseAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        System.out.println(Arrays.toString(search(mat, 37)));
    }

    static int[] search(int[][] mat, int target) {
        int r = 0, c = mat[0].length - 1;
        while(r < mat.length && c >= 0) {
            if(mat[r][c] == target)
                return new int[] {r, c};
            else if(mat[r][c] < target)
                r++;
            else
                c--;
        }
        return new int[] {-1, -1};
    }
}
