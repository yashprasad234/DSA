package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
//        System.out.println(subset(arr));
        System.out.println(subsetForDuplicates(arr));
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }


    // For duplicates, but we are checking for duplicates in the arr itself, not whether we have already added our current ans
    // to the final answer list.
    static ArrayList<ArrayList<Integer>> subsetForDuplicates(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int st = 0, end = 0;

        for(int i = 0; i < arr.length; i++) {
            int n = outer.size();
            if(i > 0 && arr[i] == arr[i-1])
                st = end + 1;
            end = n - 1;
            for (int j = st; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }

    // For duplicates, but we are checking for duplicates in the final answer. After finding the current answer i.e, current
    // subset we check whether it exists in our final answer or not;
    static ArrayList<ArrayList<Integer>> subsetForDuplicates2(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                if(!outer.contains(inner))
                    outer.add(inner);
            }
        }

        return outer;
    }
}
