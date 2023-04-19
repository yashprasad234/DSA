package arrays;

public class BinarySearch {
    public static void main(String[] args) {

    }

    static int search(int[] arr, int target, int st, int end) {
        if(st > end)
            return -1;

        int mid = st + (end - st) / 2;

        if(arr[mid] == target)
            return mid;

        if(arr[mid] > target)
            return search(arr, target, st, mid - 1);
        return search(arr, target, mid + 1, end);
    }
}
