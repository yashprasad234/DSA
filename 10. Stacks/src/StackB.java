import java.util.ArrayList;

public class StackB {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if(isEmpty())
                return -1;
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }

        public int peek() {
            if(isEmpty())
                return -1;
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
