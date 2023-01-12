public class SumOfRowElements {
    public static void main(String[] args) {
        int[][] mat = {
                {1,4,9},
                {11,4,3},
                {2,2,3}
        };
        int i = 0;
        System.out.println("The sum of the elements of row no. " + i + " is : " + rowSum(mat[i]));
    }

    static int rowSum(int[] arr) {
        int sum = 0;
        for (int a: arr)
            sum += a;
        return sum;
    }
}
