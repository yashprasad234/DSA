import java.util.ArrayList;
import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        System.out.println(pairSum(list, 7));
    }

    static ArrayList<Integer> pairSum(ArrayList<Integer> list, int target) {
        int st = 0, end = list.size()-1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        while (st < end) {
            int sum = list.get(st) + list.get(end);
            if(sum == target) {
                ans.set(0,st);
                ans.set(1,end);
                return ans;
            } else if(sum < target) {
                st++;
            } else
                end--;
        }
        return ans;
    }
}
