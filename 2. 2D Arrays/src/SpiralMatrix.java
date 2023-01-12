public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        printSpiral(mat);
    }

    static void printSpiral(int[][] mat) {
        int left = 0, right = mat[0].length-1, top = 0, bottom = mat.length-1;
        while(left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i]+" ");
            }
            top++;
            if(top > bottom)
                break;
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right]+" ");
            }
            right--;
            if(left > right)
                break;
            for (int i = right; i >= left; i--) {
                System.out.print(mat[bottom][i]+" ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(mat[i][left]+" ");
            }
            left++;
        }
    }
}
