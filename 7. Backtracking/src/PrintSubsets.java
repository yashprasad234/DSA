public class PrintSubsets {
    public static void main(String[] args) {
        printSubsets("abc", 0, new StringBuilder(""));
    }

    static void printSubsets(String str, int i, StringBuilder ans) {
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
                ans.deleteCharAt(ans.length()-1);
            }
            return;
        }
        printSubsets(str, i+1, ans.append(str.charAt(i)));
        printSubsets(str, i+1, ans);
    }
}
