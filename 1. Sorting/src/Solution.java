import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {3,7,2,4,1,5,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr =  arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}
