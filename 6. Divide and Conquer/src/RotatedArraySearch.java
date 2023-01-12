public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(rotatedRecursiveSearch(arr, 0, 0, arr.length-1));
    }

    //recursive method using divide and conquer
    static int rotatedRecursiveSearch(int[] arr, int target, int st, int end) {
        int mid = st + (end - st) / 2;
        if(arr[mid] == target)
            return mid;
        if(arr[st] <= arr[mid]) {
            if(target >= arr[st] && target <= arr[mid])
                return rotatedRecursiveSearch(arr, target, st, mid);
            else
                return rotatedRecursiveSearch(arr, target, mid + 1, end);
        } else {
            if(target >= arr[mid] && target <= arr[end])
                return rotatedRecursiveSearch(arr, target, mid+1, end);
            else
                return rotatedRecursiveSearch(arr, target, st, mid-1);
        }
    }


    //non-recursive method by finding the pivot
    static int searchInRotated(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(arr[pivot] == target)
            return pivot;
        else if(arr[pivot] > target)
            return search(arr, target,pivot+1, arr.length-1);
        else
            return search(arr, target,0, pivot-1);
    }

    static int search(int[] arr, int target,int st, int end) {
        while (st <= end) {
            int mid = st + end - st / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int st = 0, end = arr.length-1;
        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid+1;
            if(mid > st && arr[mid-1] > arr[mid])
                return mid;
            if(arr[mid] > arr[st])
                st = mid + 1;
            else
                end = mid-1;
        }
        return st;
    }
}
