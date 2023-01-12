import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int st, int end) {
        if(st >= end)
            return;
        int mid = st + (end - st)/2;
        mergeSort(arr, st, mid); //left part
        mergeSort(arr, mid+1, end); //right part
        merge(arr, st, mid, end);
    }

    static void merge(int[] arr, int st, int mid, int end) {
        int i = st, j = mid + 1, k = 0;
        int[] temp = new int[end-st+1];
        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = st; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
