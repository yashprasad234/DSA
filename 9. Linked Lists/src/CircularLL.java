public class CircularLL {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node last;
    public static int size;

    public Node addToEmpty(Node last, int data) {
        if(last != null) {
            return last;
        }
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
        size++;
        return last;
    }

    public Node addFirst(Node last, int data) {
        if(last == null) {
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        size++;
        return last;
    }

    public Node addLast(Node last, int data) {
        if(last == null)
            return addToEmpty(last, data);
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        size++;
        return last;
    }

    public Node add(Node last, int index, int data) {
        if(index == 0) {
            return addFirst(last, data);
        }
        if(index == size) {
            return addLast(last, data);
        }
        if(index > size) {
            System.out.println("Error: indexOutOfBounds");
            return last;
        }
        int i = 0;
        Node temp = last.next;
        while (i < index-2) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return last;
    }

    public Node removeFirst(Node last) {
        if(last == null) {
            System.out.println("List is empty");
            return last;
        }
        if(size == 1) {
            last = null;
            return last;
        }
        last.next = last.next.next;
        return last;
    }

    public Node removeLast(Node last) {
        if(last == null) {
            System.out.println("List is empty");
            return last;
        }
        if(size == 1) {
            last = null;
            return last;
        }
        Node temp = last.next;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;
        return last;
    }

    public void print(Node last) {
        if(last == null) {
            System.out.println("List is empty");
            return;
        } else if(size == 1) {
            System.out.println(last.data+"->"+last.data);
            return;
        }
        Node temp = last.next;
        while (temp != last) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data+"->"+temp.next.data);
        return;
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        Node last = null;
        last = cll.addLast(last,1);
        last = cll.addLast(last,2);
        last = cll.addLast(last,3);
        last = cll.addLast(last,4);
        last = cll.addLast(last,5);
        last = cll.addLast(last,6);
        cll.print(last);
        last = cll.removeFirst(last);
        cll.print(last);
        last = cll.removeLast(last);
        cll.print(last);
    }
}
