public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static boolean search(int[] arr, int target) {
        int st = 0, end = arr.length-1;
        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return true;
//          Left side of mid is sorted
            if(arr[mid] > arr[st] || arr[mid] > arr[end]) {
//                go left
                if(arr[mid] >= arr[st] && target < arr[mid])
                    end = mid - 1;
//                go right
                else
                    st = mid + 1;
            }
//          Right side of mid is sorted
            else if(arr[mid] < arr[st] || arr[mid] < arr[end]) {
//                go right
                if(arr[mid] < target && target <= arr[end])
                    st = mid + 1;
//                go left
                else
                    end = mid - 1;
            }
//          Removing duplicates
            else { // this is when arr[st] == arr[end] == arr[mid]
                end--; // st++ also works
            }
        }
        return false;
    }
}
