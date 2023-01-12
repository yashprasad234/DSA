public class TargetFrequency {
    public static void main(String[] args) {
        int[][] mat = {
                {4,7,8},
                {8,8,7}
        };
        int target = 8;
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == target)
                    count++;
            }
        }
        System.out.println("The frequency of " + target + " is : " + count);
    }
}
