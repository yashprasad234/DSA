import java.util.Arrays;

public class MinAbsoluteDifferencePair {
    public static void main(String[] args) {
        int[] arr1 = {4,1,8,7};
        int[] arr2 = {2,3,6,5};
        System.out.println(minDiff(arr1, arr2));
    }

    static int minDiff(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int diff = 0;
        for (int i = 0; i < arr2.length; i++) {
            diff += Math.abs(arr1[i]-arr2[i]);
        }
        return diff;
    }
}
