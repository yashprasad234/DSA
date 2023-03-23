import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }

    //optimised approach modified merge sort (this approach takes O(nlogn) time)

    static int mergeSort(int[] arr, int lo, int hi) {
        int invCount = 0;
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            invCount += mergeSort(arr, lo, mid);
            invCount += mergeSort(arr, mid+1, hi);
            invCount += merge(arr, lo, mid, hi);
        }
        return invCount;
    }

    static int merge(int[] arr, int lo, int mid, int hi) {
        int i = lo, j = mid, k = 0, invCount = 0;
        int[] temp = new int[hi - lo + 1];

        while (i < mid && j <= hi) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i);
                j++;
            }
            k++;
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= hi) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = lo; k < temp.length;) {
            arr[i++] = temp[k++];
        }
        return invCount;
    }
}
