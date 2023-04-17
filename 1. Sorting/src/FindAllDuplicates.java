//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int counter = arr[i] - 1;
            if(arr[i] != arr[counter])
                swap(arr, i, counter);
            else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
                list.add(arr[j]);
        }
        return list;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
