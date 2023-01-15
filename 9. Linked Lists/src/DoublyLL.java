public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node (int data) {
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printdll() {
        Node temp = head;
        System.out.print("null<-");
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            else {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
        }
        System.out.println("null");
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("DLL is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void reverseDll() {
        Node curr = tail = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("DLL is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        Node temp = head.next;
        temp.prev = null;
        head = temp;
        size--;
        return val;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.printdll();
        dll.reverseDll();
        dll.printdll();
    }
}
