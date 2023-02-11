import java.util.*;

public class MirrorTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Inorder traversal of original tree");
        levelOrder(root);
        System.out.println();
        System.out.println("Inorder traversal of mirrored tree");
        levelOrder(mirror(root));
        System.out.println();
        System.out.println("Inorder traversal of original tree after mirroring it");
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

    static Node mirror(Node root) {
        if(root == null)
            return root;

        //do the subtrees
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        //swap the left and right pointers
        //since we are swapping the nodes themselves not updating their values what we are doing is that we swapping the
        //position of subtrees whose root nodes are left and right which results in the mirrored structure
        root.left = right;
        root.right = left;

        return root;
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
