import java.util.Stack;

public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(2);
        System.out.println(s.pop());
    }
}
