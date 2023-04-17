//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length) {
            int counter = nums[i] - 1;
            if(nums[i] != nums[counter]) {
                swap(nums, i, counter);
            } else
                i++;
        }
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1)
                list.add(j+1);
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
