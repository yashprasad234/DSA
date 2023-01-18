import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        pushAtBottom(s, 5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    static void pushAtBottom(Stack s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int val = (int) s.pop();
        pushAtBottom(s, data);
        s.push(val);
    }
}
