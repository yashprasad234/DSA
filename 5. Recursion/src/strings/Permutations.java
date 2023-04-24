package strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
//        printPermutations("", str);
        System.out.println(printPermutations2("", str));
        System.out.println(permutationCount("", str));
    }

    static void printPermutations(String p, String up) {
        if(up.length() == 0) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            printPermutations(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
        }
    }

    static ArrayList<String> printPermutations2(String p, String up) {
        if(up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            ans.addAll(printPermutations2(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p, String up) {
        if(up.length() == 0) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            count += permutationCount(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
        }
        return count;
    }
}
