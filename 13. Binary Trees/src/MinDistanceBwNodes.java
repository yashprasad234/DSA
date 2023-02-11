public class MinDistanceBwNodes {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 6;
        System.out.println("The min dist between " + n1 + " and " + n2 + " is : " + minDist(root, n1, n2));
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

    static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(rightLca == null)
            return leftLca;
        if(leftLca == null)
            return rightLca;

        return root;
    }

    static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = dist(lca, n1);
        int dist2 = dist(lca, n2);
        return dist1 + dist2;
    }

    static int dist(Node root, int n) {
        //base case when no node found in branch
        if(root == null)
            return -1;
        //if node found
        if(root.data == n)
            return 0;
        //checking if the node exists in left or right
        int left = dist(root.left, n);
        int right = dist(root.right, n);

        int value = -1;
        value = left > -1 ? left : right;
        if(value > -1)
            return value + 1;
        return value;
    }
}
