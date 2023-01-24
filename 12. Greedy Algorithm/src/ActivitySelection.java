import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] st = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        int[][] activities = new int[st.length][3];

        //Sorting
        for (int i = 0; i < st.length; i++) {
            activities[i][0] = i;
            activities[i][1] = st[i];
            activities[i][2] = end[i];
        }

        //this lambda function does the sorting based on col = 2;
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<String> list = new ArrayList<>();
        list.add("A" + activities[0][0]);

        int count = 1, prevEnd = activities[0][2];
        for (int i = 1; i < st.length; i++) {
            if(prevEnd <= activities[i][1]) {
                count++;
                list.add("A" + activities[i][0]);
                prevEnd = activities[i][2];
            }
        }
        System.out.println("Max activities = " + count);
        System.out.println(list);
    }
}
