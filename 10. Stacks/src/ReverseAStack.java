import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);
    }

    static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int val = (int) s.pop();
        pushAtBottom(s, data);
        s.push(val);
    }

    static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty())
            return;
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
