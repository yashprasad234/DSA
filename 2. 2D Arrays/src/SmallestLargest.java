import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                max = Math.max(max, mat[i][j]);
                min = Math.min(min, mat[i][j]);
            }
        }
        System.out.println("The largest element in the matrix is : " + max);
        System.out.println("The smallest element in the matrix is : " + min);
    }
}
