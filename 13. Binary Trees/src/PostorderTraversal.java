public class PostorderTraversal {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        postorder(root);
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

    static class BinaryTree {
        static int ind = -1;
        public static Node buildTree(int[] nodes) {
            ind++;
            if(ind >= nodes.length)
                return null;
            if(nodes[ind] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static void postorder(Node root) {
        if(root == null)
            return;
        //print left subtree
        postorder(root.left);
        //print right subtree
        postorder(root.right);
        //print root
        System.out.print(root.data + " ");

    }
}
