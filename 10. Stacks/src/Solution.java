import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/Users/USER/Desktop/../Program Files");
        System.out.println(simplify(str));
    }

    static String simplify(String str) {
        Stack<String> s = new Stack<>();
        String res = "/";
        for (int i = 0; i < str.length(); i++) {
            String dir = "";
            while (i < str.length() && str.charAt(i) == '/') {
                i++;
            }
            while (i < str.length() && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            if(dir.equals("..")) {
                s.pop();
            }
            else if(dir.equals(".")) {
                continue;
            }
            else if(dir.length() != 0) {
                s.push(dir);
            }
        }
        Stack<String> s1 = new Stack<>();
        while (!s.isEmpty()) {
            s1.push(s.pop());
        }
        while (!s1.isEmpty()) {
            if(s1.size() == 1)
                res += s1.pop();
            else
                res += s1.pop() + "/";
        }
        return res;
    }
}