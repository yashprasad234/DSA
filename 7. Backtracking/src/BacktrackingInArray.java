import java.util.Arrays;

public class BacktrackingInArray {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        backtracking(arr, 0,1);
        System.out.println(Arrays.toString(arr));
    }

    static void backtracking(int[] arr, int i, int val) {
        if(i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = val;
        backtracking(arr, i+1, val+1);
        arr[i] -= 2;
    }
}
