import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LonelyNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,3));
        System.out.println(lonelyNumbers(list));
    }

    static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!( (i < list.size()-1 && list.contains(list.get(i) +1)) || (i > 0 && list.contains(list.get(i)-1)) || (((i > 0 && list.get(i) == list.get(i-1)) || (i < list.size()-1 && list.get(i) == list.get(i+1))))))
                ans.add(list.get(i));
        }
        return ans;
    }
}
