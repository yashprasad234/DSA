public class LL {
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

    public void addLast(int data) {
        //Step 1: create a node
        LL.Node newNode = new LL.Node(data);
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

    public static void printLL() {
//        if(head == null) {
//            System.out.println("Linked List is empty");
//            return;
//        }
        //Use temp variable whenever traversing through a LL because we don't want to change its head or tail
        LL.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void printList(Node node) {
        while (node.next != null) {
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.println(node.data+"->null");
    }

//   -------------------------------------------------Assignment Problems-----------------------------------------------
    //Problem 1: Find intersection point of two intersecting lists

    //My approach using slow fast pointer same logic as breaking cycle in LL
    public Node getIntersectionNode(Node head1, Node head2) {

        //Create a loop and make the two LL's a single LL with loop in it
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head1;

        //Finding out the intersection point using slow-fast pointer approach
        Node slow = head2;
        Node fast = head2;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        Node ans;
        //If no such loop exists maybe unnecessary here
        if(fast != slow) {
            ans = null;
            return ans;
        }
        slow = head2;
        Node prev = fast;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //This is the intersection point
        ans = prev.next;

        //Reverting the LL to their original orientation (undoing the loop)
        temp = prev.next;
        while (temp.next != head1) {
            temp = temp.next;
        }
        temp.next = null;
        return ans;
    }

    public Node getIntersectionNode2(Node head1, Node head2) {
        //Basically this function iterates over list 1 every time and keeps incrementing to the next element of the list 2
        //and whenever the two pointer that are used to iterate over these lists point toward the same element for the first time
        //it is the intersection node.
        while (head2 != null) {
            //we are considering the list 2 to be larger by default
            //at every iteration the temp pointer is set at the beginning of the list 1
            Node temp = head1;
            //this loop iterates through the 1st list every time and compares every item of the list 1 with the current item in list 2
            while (temp != null) {
                if(temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        //In case the two lists don't intersect it returns null
        return null;
    }
//----------------------------------------------------------------------------------------------------------------------
    //Problem 2:Delete N nodes after M nodes of a LL

    public void deleteNAfterM(int m, int n) {
        //"curr" will point to mth node and "next" to the m+n+1th node to which curr.next will point.
        Node next, curr = head;

        //this loop runs until we have reached the end of the LL
        while (curr != null) {
            int count = 1;

            //finding the mth node
            while(count < m && curr != null) {
                curr = curr.next;
                count++;
            }

            //if mth node or any ith node less than mth node from previous pointer reaches null then we return.
            if(curr == null)
                return;
            count = 1;

            //this points to the m+n+1th pointer
            next = curr.next;

            //finding the m+n+1th pointer
            while (count <= n && next != null) {
                next = next.next;
                count++;
            }

            //connecting the curr pointer to next pointer
            curr.next = next;

            //updating the current pointer
            curr = next;
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    //Problem 3: Swapping nodes in LL
    public void swapNodes(int x, int y) {
        if(y > size)
            return;
        //find x-prev and x-next
        Node xPrev = head;
        for (int i = 1; i < x-1 && xPrev != null; i++) {
            xPrev = xPrev.next;
        }
        Node xNode = xPrev.next;
        if(xNode == null)
            return;
        Node xNext = xPrev.next.next;

        //find y-prev and y-next
        Node yPrev = head;
        for (int i = 1; i < y-1 && yPrev != null; i++) {
            yPrev = yPrev.next;
        }
        Node yNode = yPrev.next;
        if(yNode == null)
            return;
        Node yNext = yPrev.next.next;

        //swap x and y
        xPrev.next = yNode;
        yNode.next = xNext;

        yPrev.next = xNode;
        xNode.next = yNext;
    }
//----------------------------------------------------------------------------------------------------------------------
    //Problem 4: Segregate even odd in LL
    public void segEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null) {
            end = end.next;
        }

        Node newEnd = end;

        while (curr.data % 2 != 0 && curr != end) {
            newEnd.next = curr;
            curr = curr.next;
            newEnd.next.next = null;
            newEnd = newEnd.next;
        }

        if(curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if(curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                }
                else {
                    prev.next = curr.next;
                    curr.next = null;
                    newEnd.next = curr;
                    newEnd = curr;
                    curr = prev.next;
                }

            }
        } else {
            prev = curr;
        }
        if(newEnd != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            newEnd.next = end;
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    //Problem 5: Merge k sorted arrays

    public static Node sortedMerge(Node a, Node b) {
        Node result = null;
        if(a == null)
            return b;
        else if(b == null)
            return a;
        if(a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static Node mergeKLists(Node arr[], int last) {
        while (last != 0) {
            int i = 0, j = last;
            while (i < j) {
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if(i >= j)
                    last = j;
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int k = 3, n = 4;
        Node[] arr = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeKLists(arr, k-1);
        printList(head);
    }
}
