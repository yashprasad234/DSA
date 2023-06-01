import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPositionInAnArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1, -1};
        ans[0] = firstAndLastPosi(arr, target, true);
        ans[1] = firstAndLastPosi(arr, target, false);
        System.out.println(Arrays.toString(ans));
    }

    static int firstAndLastPosi(int[] arr, int target, boolean fIndex) {
        int st = 0, end = arr.length, ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target) {
                ans = mid;
                if(fIndex)
                    end = mid - 1;
                else
                    st = mid + 1;
            } else if(arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return ans;
    }
}
