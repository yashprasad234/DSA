import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int st, int end) {
        if(st >= end)
            return;
        int pivot = partition(arr, st, end);
        quickSort(arr, st, pivot-1);
        quickSort(arr, pivot+1, end);

    }

    static int partition(int[] arr, int st, int end) {
        int i = st-1;
        int pivot = arr[end];
        for(int j = st; j < end; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
