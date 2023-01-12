public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("The sum of the matrix's diagonals is : " + matDiagonalSum(mat));
    }

    static int matDiagonalSum(int[][] mat) {
        int sum = 0, left = 0, right = mat[0].length-1;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][left];
            if(left != right) {
                sum += mat[i][right];
            }
            left++;
            right--;
        }
        return sum;
    }
}
