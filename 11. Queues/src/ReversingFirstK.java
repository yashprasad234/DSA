import java.util.*;

public class ReversingFirstK {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverseQ(q, 5);
        System.out.println(q);
    }

    static void reverseQ(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        int n = k;
        while (n > 0) {
            s.push(q.remove());
            n--;
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        n = q.size()-k;
        while (n > 0) {
            int val = q.remove();
            q.add(val);
            n--;
        }
    }
}
