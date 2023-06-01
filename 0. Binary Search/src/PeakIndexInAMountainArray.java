public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[]  arr = {0, 10, 5, 2};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr) {
        int st = 0, end = arr.length-1;
        while(st <= end) {
//      the two cases here can be that we are either in the ascending part of the array or the descending part of the array
//      for the ascending part the peak will be towards right and for descending towards left
            int mid = st + (end - st) / 2;
//          Case 1: ascending part, do : st = mid + 1;
            if(mid < arr.length-1 && arr[mid] < arr[mid + 1])
                st = mid + 1;
//          Case 2: descending part, do : end = mid - 1;
            else
                end = mid - 1;
        }
//      at this point both start and end will be at the peak so returning either does the job
        return st;
    }
}
