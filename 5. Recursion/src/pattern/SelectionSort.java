package pattern;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        sort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int i, int j, int max) {
        // By starting i from the end of the array we don't need a last index pointer to swap we can simply swap with i
        // If we decided to put the min element at its correct position (for ascending sorted array) we would need a last
        // pointer to calculate which position to swap with, so it is easier to do while putting the max element at its
        // correct position.
        if (i <= 0)
            return;
        if (j <= i) {
            if (arr[max] < arr[j]) {
                max = j;
            }
            sort(arr, i, j + 1, max);
        } else {
            swap(arr, max, i);
            sort(arr, i-1, 0, 0);
        }
    }

    static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
