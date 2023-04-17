import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2};
        selectionSortAscending(arr);
        System.out.println(Arrays.toString(arr));
        selectionSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0, last = arr.length - i - 1;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[max])
                    max = j;
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }

    static void selectionSortDescending(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = 0, last = arr.length - i - 1;
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[last];
            arr[last] = temp;
        }
    }
}