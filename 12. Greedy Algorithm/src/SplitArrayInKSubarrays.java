public class SplitArrayInKSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 3;
        int n = 4;
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans);
    }

    public static int ans = 10000000;

    static void solve(int[] a, int n, int k, int index, int sum, int maxSum) {
        if(k == 1) { //base case
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            maxSum = Math.max(maxSum, sum);
            ans = Math.min(ans, maxSum);
            return;
        }
        sum = 0;
        for (int i = index; i < n; i++) {
            sum += a[i];
            maxSum = Math.max(maxSum, sum); //maximizing sum;
            solve(a, n, k-1, i+1, sum, maxSum); //recursive call for k-1 subArrays and index += 1
        }
    }
}
