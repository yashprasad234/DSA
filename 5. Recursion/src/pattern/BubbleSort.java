package pattern;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int i, int j) {
        if (i == 0)
            return;
        if(j < i) {
            if(arr[j] > arr[j+1])
                swap(arr, j, j+1);
            bubbleSort(arr, i, j+1);
        } else
            bubbleSort(arr, i-1, 0);
    }

    static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
