import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int[][] arr = {
                {5,24},
                {39,60},
                {5,28},
                {27,40},
                {50,90}
        };
        System.out.println(maxPairs(arr));
    }

    static int maxPairs(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        int count = 1, prevLast = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if(prevLast < arr[i][0]) {
                count++;
                prevLast = arr[i][1];
            }
        }
        return count;
    }
}
