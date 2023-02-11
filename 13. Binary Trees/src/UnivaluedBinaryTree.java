public class UnivaluedBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        System.out.println(isUnivalued(root, root.data));
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

    static boolean isUnivalued(Node root, int data) {
        if(root == null)
            return true;
        if(root.data != data)
            return false;
        boolean left = isUnivalued(root.left, data);
        boolean right = isUnivalued(root.right, data);
        return left && right;
    }
}
