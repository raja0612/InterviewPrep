package src.problems.Trees;

import java.util.stream.StreamSupport;

class DFSNode {
    int data;
    DFSNode left, right;
    public DFSNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class DFSTree{
    DFSNode root;

    public DFSTree() {
        this.root= null;
    }
    int height(DFSNode root)
    {
        if (root == null)
            return 0;
        else
        {
            System.out.println("else");
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            System.out.println(lheight);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);

        }
    }

    public void inOrder(DFSNode node) {
        // traverse left sub tree
        // visit root
        // traverse right subtree;
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public void preOrder(DFSNode node) {
        /*
           visit root node.
           traverse left sub tree
           traverse right sub tree
         */
        if(node == null) return;
        System.out.print(node.data+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(DFSNode node) {
        /*
          traverse the left sub tree
          traverse the right sub tree
          visit root
         */
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+ " ");
    }
}

public class DFS {

    public  static void main(String args[]) {
        DFSTree tree = new DFSTree();
        tree.root = new DFSNode(1);
        tree.root.left = new DFSNode(2);
        tree.root.right = new DFSNode(3);
        tree.root.left.left = new DFSNode(4);
        tree.root.left.right = new DFSNode(5);

        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
        System.out.println(tree.height(tree.root));
    }
}
