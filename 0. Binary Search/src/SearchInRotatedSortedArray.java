public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return mid;
//          left half of mid is sorted
            if(arr[mid] >= arr[0]) {
//            go left
                if(target >= arr[st] && arr[mid] > target)
                    end = mid - 1;
//            go right
                else
                    st = mid + 1;
            }

//          right half of mid is sorted
            else {
//            go right
                if(target <= arr[end] && arr[mid] < target)
                    st = mid + 1;
//            go left
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
