public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Time complexity for this addFirst function is O(1)
    public void addFirst(int data) {
        //Step 1: Create a new node
        Node newNode = new Node(data);
        size++;
        //base case
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //Step 2: next of new node = head;
        newNode.next = head;

        //Step 3: newNode = head;
        head = newNode;
    }

    //Time complexity of addLast is also O(1)
    public void addLast(int data) {
        //Step 1: create a node
        Node newNode = new Node(data);
        size++;
        //corner case
        //by convention a linked list is considered empty if its head points to null, so we don't take tail == null
        if(head == null) {
            tail =  head = newNode;
            return;
        }

        //Step 2: tail.next = newNode
        tail.next = newNode;

        //Step 3: tail = newNode;
        tail = newNode;
    }

    public void printLL() {
//        if(head == null) {
//            System.out.println("Linked List is empty");
//            return;
//        }
        //Use temp variable whenever traversing through a LL because we don't want to change its head or tail
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
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

    public int searchIterative(int key) {
        Node temp = head;
        int i = 0;
        while (i < size) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if(head == null)
            return -1;
        if(head.data == key)
            return 0;
        int index = helper(head.next, key);
        if(index == -1)
            return -1;
        return 1 + index;
    }

    public int searchRecursive(int key) {
        return helper(head, key);
    }

    public void reverse() { //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromEnd(int n) {
        int listSize = 0;
        Node temp = head;
        // calculating size;
        while (temp != null) {
            temp = temp.next;
            listSize++;
        }
        if(n == listSize) {
            head = head.next;
            return;
        } else if(n == 1) {
            removeLast();
            return;
        }
        int i = 1;
        Node prev = head;
        while (i < listSize-n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean llIsPalindrome() {
        if(head == null || head.next == null)
            return true;
        //step 1: find midNode
        Node midNode = findMid(head);

        //step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        //step 3: check if left == right
        while (right != null) {
            if(left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.add(2,3 );

//        ll.printLL();
//        ll.removeFirst();
//        ll.printLL();
//        ll.removeLast();
//        ll.printLL();
//        System.out.println(ll.size);
//        System.out.println(ll.searchIterative(3));
//        System.out.println(ll.searchRecursive(4));
//        ll.reverse();
//        ll.removeNthFromEnd(3);
//        ll.printLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLL();
        System.out.println(ll.llIsPalindrome());
    }
}
