public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(largestSpliSum(arr, k));
    }

    static int largestSpliSum(int[] arr, int k) {
        int st = Integer.MIN_VALUE, end = 0;
        for(int a: arr) {
            st = Math.max(a, st);
            end += a;
        }
        while (st < end) {
            int mid = st + (end - st) / 2;
            int sum = 0, pieces = 1;
            for(int a : arr) {
                if(sum + a <= mid)
                    sum += a;
                else {
                    pieces++;
                    sum = a;
                }
            }
            if(pieces <= k)
                end = mid;
            else
                st = mid + 1;
        }
        return st; // return end; does the same
    }
}

