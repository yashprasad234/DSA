import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        insertionSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) { // j > 0 because we compare with arr[j] with arr[j-1]
                if(arr[j] < arr[j-1])
                    swap(arr, j, j-1);
                else
                    break;
            }
        }
    }

    static void insertionSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) { // j > 0 because we compare with arr[j] with arr[j-1]
                if(arr[j] > arr[j-1])
                    swap(arr, j, j-1);
                else
                    break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
