import java.util.Stack;

public class LLIsPalindrome {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(3);
        newNode.next.next.next = new Node(2);
        newNode.next.next.next.next = new Node(1);
        newNode.next.next.next.next.next = new Node(0);
        head = newNode;
        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(Node head) {
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        while (head != null) {
            if(head.data != s.peek()) {
                return false;
            }
            s.pop();
            head = head.next;
        }
        return true;
    }
}
