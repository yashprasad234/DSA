import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = {10,20,30};
        int[] value = {60,100,120};
        System.out.println(maxValue(weight, value, 50));
    }

    static int maxValue(int[] weight, int[] value, int w) {
        double[][] ratio = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            //1st column stores index
            ratio[i][0] = i;
            //2nd column stores ratio
            ratio[i][1] = (double) value[i]/weight[i];
        }

        //ascending sorted
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int maxProfit = 0, capacity = w;
        for (int i = value.length-1; i >= 0; i--) {
            int ind = (int) ratio[i][0];
            if(capacity >= weight[ind]) {
                maxProfit += value[ind];
                capacity -= weight[ind];
            } else {
                maxProfit += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        return maxProfit;
    }
}
