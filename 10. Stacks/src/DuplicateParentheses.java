import java.util.*;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String str = "(((a+(b)))+(c+d))"; //should return true
        String str2 = "(a-b)"; //should return false
        System.out.println(hasDuplicate(str));
    }

    static boolean hasDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ')') {
                s.push(ch);
            } else {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if(count < 1)
                    return true;
            }
        }
        return false;
    }
}
