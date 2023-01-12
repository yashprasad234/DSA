import java.util.ArrayList;
import java.util.Arrays;

public class MostFrequentNumberFollowingKey {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,100,200,1,100));
        System.out.println(mostFrequent(list,1));
    }

    static int mostFrequent(ArrayList<Integer> list, int key) {
        int[] count = new int[1001];
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == key) {
                count[list.get(i+1)]++;
            }
        }
        int ans = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < 1001; i++) {
            if(count[i] > max) {
                max = count[i];
                ans = i;
            }
        }
        return ans;
    }
}
