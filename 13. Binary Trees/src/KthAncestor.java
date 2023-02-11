public class KthAncestor {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n = 5, k = 2;
        kthAncestor(root, n, k);
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

    static int kthAncestor(Node root, int n, int k) {
        if(root == null)
            return -1;
        if(root.data == n)
            return 0;

        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        int value = leftDist > -1 ? leftDist : rightDist;
        if(value == -1)
            return -1;
        if(value + 1 == k)
            System.out.println(root.data);

        return value+1;
    }
}
