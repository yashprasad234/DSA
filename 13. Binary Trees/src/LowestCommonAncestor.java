import java.util.ArrayList;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("LCA for the node 4 and the node 6 is : " + lca2(root, 4, 5).data);
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

    static int lca(Node root, int n1, int n2) {
        //find path for node n1
        ArrayList<Node> path1 = new ArrayList<>();
        getPath(root, n1, path1);
        //find path for node n2
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n2, path2);
        //run a loop to find lca
        int ans = 0, i = 0;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if(path1.get(i).data != path2.get(i).data)
                break;
        }
        return path1.get(i-1).data;
    }

    static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (rightLca == null)
            return leftLca;
        if (leftLca == null)
            return rightLca;

        return root;
    }

    static boolean getPath(Node root, int n, ArrayList<Node> path) {
        //base case
        if(root == null)
            return false;
        //add root
        path.add(root);
        //condition for node to exist in the path
        if(root.data == n)
            return true;
        //check if node exists in subtree of root
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        //if exists return true
        if(foundLeft || foundRight)
            return true;
        //else return false
        else {
            //removing root from the path
            path.remove(path.size()-1);
            return false;
        }
    }
}
