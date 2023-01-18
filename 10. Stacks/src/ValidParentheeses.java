import java.util.*;

public class ValidParentheeses {
    public static void main(String[] args) {
        String str = "()(()";
        System.out.println(isValid(str));
    }

    static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            else {
                if(s.isEmpty())
                    return false;
                char pair = ' ';
                switch (ch) {
                    case ')' : pair = '(';
                        break;
                    case ']': pair = '[';
                        break;
                    default: pair = '{';
                }
                if(pair == s.peek()) {
                    s.pop();
                } else
                    return false;
            }
        }
        return s.isEmpty();
    }
}
