import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        countingSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countingSortAscending(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        int[] countArr = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < countArr.length; i++) {
            while(countArr[i] > 0) {
                countArr[i]--;
                arr[j] = i;
                j++;
            }
        }
        return;
    }

    static void countingSortDescending(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        int[] countArr = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        int j = 0;
        for (int i = countArr.length-1; i >= 0; i--) {
            while(countArr[i] > 0) {
                countArr[i]--;
                arr[j] = i;
                j++;
            }
        }
        return;
    }
}
