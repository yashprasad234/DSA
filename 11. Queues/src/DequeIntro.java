import java.util.Deque;
import java.util.LinkedList;

public class DequeIntro {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
