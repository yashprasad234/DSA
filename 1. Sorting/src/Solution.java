import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        countingSortDescending(arr);
        System.out.println(Arrays.toString(arr));
        countingSortAscending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countingSortAscending(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                count[i]--;
                arr[j++] = i;
            }
        }
    }

    static void countingSortDescending(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i] > 0) {
                count[i]--;
                arr[j++] = i;
            }
        }
    }
}
