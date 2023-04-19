package arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 4;
        System.out.println(rotatedSearch(arr, target, 0, arr.length-1));
    }

    static int rotatedSearch (int[] arr, int target, int st, int end) {
        if(st > end) {
            return -1;
        }
        int mid = st + (end - st) / 2;

        if(arr[mid] == target)
            return mid;

        if(arr[mid] >= arr[0]) {
            if(target >= arr[st] && target < arr[mid])
                return rotatedSearch(arr, target, st, mid - 1);
            else
                return rotatedSearch(arr, target, mid + 1, end);
        } else {
            if(target <= arr[end] && target > arr[mid])
                return rotatedSearch(arr, target, mid + 1, end);
            else
                return rotatedSearch(arr, target, st, mid - 1);
        }
    }
}
