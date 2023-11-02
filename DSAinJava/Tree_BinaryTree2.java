// this tree lecture in youtube by Apna Collage channel its name is "Binary Tree in Data Structure" time taken is 1:22:13

import java.util.*;

// this class represent a single node of a tree
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// this class is use for Diameter2
class TreeInfo {
    int ht, diam;

    public TreeInfo(int ht, int diam) {
        this.ht = ht;
        this.diam = diam;
    }
}

class Tree_BinaryTree2 {
    public TreeNode root;

    public Tree_BinaryTree2() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode curNode = q.remove();
            if (curNode == null) {
                System.out.println();
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    int CountNodes(TreeNode k) {
        if (k == null) {
            return 0;
        }
        int leftnode = CountNodes(k.left);
        int rightnode = CountNodes(k.right);

        return leftnode + rightnode + 1;
    }

    int SumOfNodes(TreeNode k) {
        if (k == null) {
            return 0;
        }
        int leftsum = SumOfNodes(k.left);
        int rightsum = SumOfNodes(k.right);

        return leftsum + rightsum + root.data;
    }

    int height(TreeNode k) {
        if (k == null) {
            return 0;
        }

        int leftheight = height(k.left);
        int rightheight = height(k.right);
        int maxheight = Math.max(leftheight, rightheight) + 1;

        return maxheight;
    }

    // time complexity is O(n^2)
    int Diameter(TreeNode k) {
        if (k == null) {
            return 0;
        }
        int leftdia = Diameter(k.left);
        int rightdia = Diameter(k.right);
        int rootdia = height(k.left) + height(k.right) + 1;
        return Math.max(leftdia, Math.max(rightdia, rootdia));
    }

    // same function ha bus time complexity ko reduce karne ke liye
    // time complexity is O(n)
    public TreeInfo Diameter2(TreeNode k) {
        if (k == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = Diameter2(k.left);
        TreeInfo right = Diameter2(k.right);
        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    // this function is right but you create two tree then call this function
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        if (root.data == subRoot.data) {
            return (isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot));
        }
        return false;
    }

    // this function is use in isSubtree() function
    boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        return (isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right));
    }

}

class Main {
    public static void main(String[] args) {
        Tree_BinaryTree2 tree = new Tree_BinaryTree2();
        int nodes[] = { 5, 2, 8, 1, 4, 7, 10, 3, 6, 9, 11 };
        int nodes2[] = { 12, 13, 11 };

        for (int i = 0; i < nodes.length; i++) {
            tree.insert(nodes[i]);
        }

        for (int i = 0; i < nodes2.length; i++) {
            tree.insert(nodes2[i]);
        }

        System.out.println("Traversal");
        // System.out.println("inorder");
        // tree.inOrder(tree.root);
        // System.out.println("preorder");
        // tree.preOrder(tree.root);
        // System.out.println("postorder");
        // tree.postOrder(tree.root);
        System.out.println("leelorder");
        tree.levelOrder(tree.root);
        System.out.println("count:- " + tree.CountNodes(tree.root));
        System.out.println("sum:- " + tree.SumOfNodes(tree.root));
        System.out.println("height:- " + tree.height(tree.root));
        System.out.println("Diameter:- " + tree.Diameter(tree.root));
        System.out.println("Diameter2:- " + tree.Diameter2(tree.root).diam);
        // before we make 2 tree then call isSubtree() function
        // System.out.println("isSubtree:- " + tree.isSubtree(tree.root));
    }
}