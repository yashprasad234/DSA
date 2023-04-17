//https://leetcode.com/problems/missing-number/ (Amazon)

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i || nums[i] == nums.length) {
                i++;
            } else {
                swap(nums, i, nums[i]);
            }
        }
        for(i = 0; i < nums.length; i++) {
            if(nums[i] != i)
                return i;
        }
        return nums.length;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return;
    }
}
