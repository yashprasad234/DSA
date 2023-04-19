import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        sort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int i, int j, int max) {
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
