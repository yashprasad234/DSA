import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr, arr.length, 13));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int i = 0, j = 0, sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < n && j < n) {
            if(sum == s) {
                list.add(i+1);
                list.add(j);
                break;
            } else if(sum > s) {
                sum -= arr[i];
                i++;
            } else {
                sum += arr[j];
                j++;
            }
        }
        return list;
    }
}
