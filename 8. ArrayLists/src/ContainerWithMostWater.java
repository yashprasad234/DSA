import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(arr));
    }

    static int maxWater(int[] list) {
        int max = 0, hieght = 0, base = 0;
        int st = 0, end = list.length-1;
        while (st < end) {
            hieght = Math.min(list[st], list[end]);
            base = end-st;
            max = Math.max(max, base*hieght);
            if(list[st] < list[end]) {
                st++;
            } else
                end--;
        }
        return max;
    }
}
