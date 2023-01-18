import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseString(str));
    }

    static String reverseString(String str) {
        StringBuilder ans = new StringBuilder("");
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()) {
            ans.append(s.pop());
        }
        return ans.toString();
    }
}
