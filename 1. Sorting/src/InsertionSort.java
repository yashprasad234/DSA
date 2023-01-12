import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        insertionSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSortAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}
