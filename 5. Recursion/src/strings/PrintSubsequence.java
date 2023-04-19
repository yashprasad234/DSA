import java.util.ArrayList;

public class PrintSubsequence {
    public static void main(String[] args) {
//        printSubsequences("abc", 0, "");
//        printSubsequencesAscii("abc", 0, "");
//        System.out.println(printSubsequences2("abc", 0, ""));
        System.out.println(printSubsequencesAsciiList("abc", 0, ""));
    }

    static void printSubsequences(String str, int i, String ans) {
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        printSubsequences(str, i+1, ans + "");
        printSubsequences(str, i+1, ans + ch);
    }

    static ArrayList<String> printSubsequences2(String str, int i, String ans) {
        ArrayList<String> list = new ArrayList<>();
        if(i == str.length()) {
            list.add(ans);
            return list;
        }
        char ch = str.charAt(i);
        ArrayList<String> list2 = printSubsequences2(str, i+1, ans + ch);
        ArrayList<String> list1 = printSubsequences2(str, i+1, ans + "");
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }

    static void printSubsequencesAscii(String str, int i, String ans) {
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        printSubsequencesAscii(str, i+1, ans + "");
        printSubsequencesAscii(str, i+1, ans + ch);
        printSubsequencesAscii(str, i+1, ans + (ch + 0));
    }

    static ArrayList<String> printSubsequencesAsciiList(String str, int i, String ans) {
        ArrayList<String> list = new ArrayList<>();
        if(i == str.length()) {
            list.add(ans);
            return list;
        }
        char ch = str.charAt(i);
        ArrayList<String> list1 = printSubsequencesAsciiList(str, i+1, ans + "");
        ArrayList<String> list2 = printSubsequencesAsciiList(str, i+1, ans + ch);
        ArrayList<String> list3 = printSubsequencesAsciiList(str, i+1, ans + (ch + 0));
        list1.addAll(list2);
        list1.addAll(list3);
        return list1;
    }
}
