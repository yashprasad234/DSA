import java.util.*;

public class QueueUsing2Stacks2 {

    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) { //O(n)
            s1.push(data);
        }

        public int remove() { //O(1)
            if(s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int val = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return val;
        }

        public int peek() { //O(1)
            if(s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int val = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return val;
        }
    }

    public static void main(String[] args) {
        QueueUsing2Stacks1.Queue q = new QueueUsing2Stacks1.Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
