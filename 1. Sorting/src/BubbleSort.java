import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortAscending(int[] arr) {
        int n = arr.length-1;
        for(int i = 0; i <= n; i++) {
            int swap = 0;
            for(int j = 0; j < n-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0)
                break;
        }
        return;
    }

    static void bubbleSortDescending(int[] arr) {
        int n = arr.length-1;
        for(int i = 0; i <= n; i++) {
            int swap = 0;
            for(int j = 0; j < n-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0)
                break;
        }
        return;
    }
}
