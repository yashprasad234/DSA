import java.util.ArrayList;

public class ReverseOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        System.out.println(list);
        int st = 0, end = list.size()-1;
        while (st <= end) {
            Integer temp = list.get(st);
            list.set(st, list.get(end));
            list.set(end, temp);
            st++;
            end--;
        }
        System.out.println(list);
    }
}
