import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {3,7,2,4,1,5,6};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int a: arr) {
            max = Math.max(a, max);
        }
        int[] counting = new int[max+1];
        for(int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }
        int k = 0;
        for(int i = 0; i < counting.length; i++) {
            if(counting[i] > 0) {
                while(counting[i] > 0) {
                    arr[k] = i;
                    k++;
                    counting[i]--;
                }
            }
        }
    }
}
