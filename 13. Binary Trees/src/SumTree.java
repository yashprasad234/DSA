import java.util.LinkedList;
import java.util.Queue;

public class SumTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        sumTree(root);
        levelOrder(root);
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

    static int sumTree(Node root) {
        if(root == null)
            return 0;
        int data = root.data;
        root.data = sumTree(root.left) + sumTree(root.right);
        return data + root.data;
    }

    static void levelOrder(Node root) {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                if(q.isEmpty())
                    return;
                else
                    q.add(null);
            }
            else {
                System.out.print(curr.data + " ");
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
    }
}
