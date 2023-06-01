public class InfiniteSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 230, 400, 404, 430, 432, 456, 476, 489, 500, 547, 567, 583};
        int target = 170;
        System.out.println(searchInInfiniteArray(arr, target));
    }

    static int searchInInfiniteArray(int[] arr, int target) {
        int st = 0, end = 1, gap = 1;
        while (arr[end] < target) {
            st = end + 1;
            end = st + gap * 2;
            gap *= 2;
        }
        return search(arr, target, st, end);
    }

    static int search(int[] arr, int target, int st, int end) {
        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
