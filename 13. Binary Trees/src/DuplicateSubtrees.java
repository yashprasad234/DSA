import java.util.*;

public class DuplicateSubtrees {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        root.right.left.left = new Node(3);
        root.right.right.left = new Node(4);
        root.right.right.left.left = new Node(3);
        inOrder(root);
    }

    static HashMap<String, Integer> m = new HashMap<>();
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

    static String inOrder(Node root) {
        if(root == null)
            return "";
        String str = "(";
        str += inOrder(root.left);
        str += Integer.toString(root.data);
        str += inOrder(root.right);
        str += ")";

        if(m.get(str) != null && m.get(str) == 1) {
            System.out.print(root.data + " ");
        }
        if(m.containsKey(str))
            m.put(str, m.get(str) + 1);
        else
            m.put(str, 1);
        return str;
    }

    static void printAllDuplicates(Node root) {
        m = new HashMap<>();
        inOrder(root);
    }
}
