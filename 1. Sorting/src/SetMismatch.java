//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int counter = arr[i] - 1;
            if(arr[i] != arr[counter]) {
                swap(arr, i, counter);
            } else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1) {
                return new int[] {arr[j], j+1};
            }
        }
        return new int[] {arr[arr.length-1], arr.length};
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
