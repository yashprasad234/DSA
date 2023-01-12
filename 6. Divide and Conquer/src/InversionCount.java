public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }

    //brute force approach (this takes O(n2) time)
//    static int inversionCount(int[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] > arr[j])
//                    count++;
//            }
//        }
//        return count;
//    }

    //optimised approach modified merge sort (this approach takes O(nlogn) time)

    static int mergeSort(int[] arr, int lo, int hi) {
        int invCount = 0;
        if(lo < hi){
            int mid = lo + (hi - lo) / 2;
            invCount += mergeSort(arr, lo, mid);
            invCount += mergeSort(arr, mid + 1, hi);
            invCount += merge(arr, lo, mid+1, hi);
        }
        return invCount;
    }

    static int merge(int[] arr, int lo, int mid, int hi) {
        int[] temp = new int[hi-lo+1];
        int i = lo, j = mid, k = 0;
        int invCount = 0;
        while (i < mid && j <= hi) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i);
                j++;
                k++;
            }
        }
        while(i < mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= hi) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (i = lo, k = 0; k < temp.length;) {
            arr[i++] = temp[k++];
        }
        return invCount;
    }
}
