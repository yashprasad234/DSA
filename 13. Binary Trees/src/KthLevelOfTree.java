import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthLevelIterative(root, 3);
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void kthLevelIterative(Node root, int k) {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                if(q.isEmpty())
                    return;
                else
                    q.add(null);
                //when we encounter null it means we are going to the next level
                level++;
            }
            else {
                //printing elements on the kth level
                if(level == k)
                    System.out.print(curr.data + " ");
                else if(level < k) {
                    if (curr.left != null)
                        q.add(curr.left);
                    if (curr.right != null)
                        q.add(curr.right);
                }
                else
                    return;
            }
        }

    }

    static void kthLevelRecursive(Node root, int level, int k) {
        if(root == null)
            return;
        if(level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevelRecursive(root.left, level+1, k);
        kthLevelRecursive(root.right, level+1, k);
    }

}
