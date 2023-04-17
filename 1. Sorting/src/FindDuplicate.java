//https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int counter = arr[i] - 1;
            if(arr[i] != arr[counter]) {
                swap(arr, i, counter);
            } else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
                return arr[j];
        }
        return arr[arr.length-1];
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return;
    }
}
