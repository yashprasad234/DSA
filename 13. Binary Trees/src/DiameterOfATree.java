public class DiameterOfATree {
    public static void main(String[] args) {
        //      1
        //     / \
        //    2   3
        //   / \ / \
        //  4  5 6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Diameter of the tree is : " + dia2(root).dia);
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

    public static class Info {
        int dia;
        int ht;

        Info(int dia, int ht) {
            this.dia = dia;
            this.ht =  ht;
        }
    }

    static int height(Node root) {
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    static int dia(Node root) {
        if(root == null) {
            return 0;
        }
        int selfDia = height(root.left) + height(root.right) + 1;
        int ld = dia(root.left);
        int rd = dia(root.right);
        return Math.max(Math.max(ld, rd), selfDia);
    }

    static Info dia2(Node root) {
        if(root == null) {
            return new Info(0,0);
        }

        Info lInfo = dia2(root.left);
        Info rInfo = dia2(root.right);

        int diameter = Math.max(Math.max(lInfo.dia, rInfo.dia), (lInfo.ht + rInfo.ht + 1));
        int height = Math.max(lInfo.ht, rInfo.ht) + 1;

        return new Info(diameter, height);
    }
}
