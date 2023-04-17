//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1) {
                return j+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return;
    }
}
