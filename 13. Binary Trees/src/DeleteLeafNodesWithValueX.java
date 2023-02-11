import java.util.*;

public class DeleteLeafNodesWithValueX {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        deleteLeafX(root, 3);
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

    static void deleteLeafX(Node root, int x) {
        if(root == null)
            return;
        if((root.left != null) && (root.left.data == x && (root.left.left == null && root.left.right == null)))
            root.left = null;
        if((root.right != null) && (root.right.data == x && (root.right.left == null && root.right.right == null)))
            root.right = null;
        deleteLeafX(root.left, x);
        deleteLeafX(root.right, x);
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
