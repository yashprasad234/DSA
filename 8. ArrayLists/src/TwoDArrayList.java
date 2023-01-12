import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
            list2.add(2*i);
            list3.add(3*i);
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
    }
}
