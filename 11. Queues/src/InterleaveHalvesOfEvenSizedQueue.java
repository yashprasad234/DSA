import java.util.LinkedList;
import java.util.Queue;

public class InterleaveHalvesOfEvenSizedQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

    static void interLeave(Queue<Integer> q) {
        Queue<Integer> q1 = new LinkedList<>();

        int half = q.size() / 2;
        while (half > 0) {
            q1.add(q.remove());
            half--;
        }
        while (!q1.isEmpty()) {
            int val = q.remove();
            q.add(q1.remove());
            q.add(val);
        }
    }
}
