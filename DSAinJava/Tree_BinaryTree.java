class Tree_BinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }

    }

    // preorder print
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder print
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.println(root.data + " ");
        preorder(root.right);
    }

    // postorder print
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        // Node
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("pre order");
        preorder(root);
        System.out.println("in order");
        inorder(root);
        System.out.println("post order");
        postorder(root);
    }
}