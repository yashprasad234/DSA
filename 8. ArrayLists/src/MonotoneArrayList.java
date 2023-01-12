import java.util.ArrayList;
import java.util.Arrays;

public class MonotoneArrayList {
    //monotone means sorted in increasing or decreasing order
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,2));
        System.out.println(isMonotone(list));
    }

    static boolean isMonotone(ArrayList<Integer> list) {
        //decreasing
        if(list.get(0) > list.get(list.size()-1)) {
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i) > list.get(i-1))
                    return false;
            }
        }
        //increasing
        else {
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i) < list.get(i-1))
                    return false;
            }
        }
        return true;
    }
}
