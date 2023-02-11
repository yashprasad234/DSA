public class MaxPathSum {
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(findMaxSum(root));
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

    static class Res {
        public int val;
    }

    static int findMaxUtil(Node root, Res res) {
        if(root == null)
            return 0;
        int l = findMaxUtil(root.left, res);
        int r = findMaxUtil(root.right, res);

        int maxSingle = Math.max(Math.max(l, r) + root.data, root.data);
        int maxTop = Math.max(maxSingle, l+r+ root.data);
        res.val = Math.max( res.val, maxTop);
        return maxSingle;
    }

    static int findMaxSum(Node root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(root, res);
        return res.val;
    }

}
