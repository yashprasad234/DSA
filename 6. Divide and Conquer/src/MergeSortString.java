import java.util.Arrays;

public class MergeSortString {
    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(String[] arr, int st, int end) {
        if(st >= end)
            return;
        int mid = st + (end - st) / 2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, st, mid, end);
    }

    static void merge(String[] arr, int st, int mid, int end) {
        int i = st, j = mid+1, k = 0;
        String[] temp = new String[end-st+1];
        while (i <= mid && j <= end) {
            if(arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
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
        for (i = st, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
