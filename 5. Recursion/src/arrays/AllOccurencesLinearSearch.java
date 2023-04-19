package arrays;

import java.util.ArrayList;

public class AllOccurencesLinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        System.out.println(allOccurences(arr, 4, 0, new ArrayList<>()));
        System.out.println(allOccurences2(arr, 4, 0));
    }

    static ArrayList<Integer> allOccurences(int[] arr, int target, int i, ArrayList<Integer> list) {
        if(i == arr.length)
            return list;
        if(arr[i] == target)
            list.add(i);
        return allOccurences(arr, target, i+1, list);
    }

    static ArrayList<Integer> allOccurences2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
            return list;
        if(arr[i] == target)
            list.add(i);
        ArrayList<Integer> ansFromBelowCalls = allOccurences2(arr, target, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
