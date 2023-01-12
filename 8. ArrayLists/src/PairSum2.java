import java.util.ArrayList;
import java.util.Arrays;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(11,15,6,8,9,10));
        System.out.println(Arrays.toString(pairSum(list, 16)));
    }

    static int[] pairSum(ArrayList<Integer> list, int target) {
        int pivot = findPivot(list);
        int n = list.size();
        int st = (pivot + 1) % n, end = pivot;
        while (st != end) {
            int sum = list.get(st) + list.get(end);
            if(sum == target) {
                return new int[] {st, end};
            } else if(sum < target) {
                //modular arithmetic used to bring 'st' to zero when it exceeds last index
                st = (st + 1) % n;
            } else {
                //this updation helps in bringing the end pointer at the last index whenever it becomes negative
                end = (n+end - 1) % n;
            }
        }
        return new int[] {-1, -1};
    }

    static int findPivot(ArrayList<Integer> list) {
        int st = 0, end = list.size()-1;
        while (st != end) {
            int mid = st + (end - st) / 2;
            if (list.get(mid) > list.get(mid+1))
                return mid;
            else if(list.get(mid) > list.get(0))
                st++;
            else
                end--;
        }
        return list.size()-1;
    }
}
