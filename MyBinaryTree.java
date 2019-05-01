class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
}

public class MyBinaryTree {
    TreeNode root;   // point every tree with a root. It refers to main tree.

    void insert(int data) {
        root = insert(root, data);
    }

    private TreeNode insert(TreeNode root, int data) {   //helper method to return node
        if (root == null) {     // if no root is present
            TreeNode node = new TreeNode();    //created a new node.
            node.data = data;   // gave data to node.
            return node;
        } else {
            if (root.left == null) {
                root.left = insert(root.left, data);
            } else {               // checking for right side
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    void display(){
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        MyBinaryTree bt = new MyBinaryTree();

        bt.insert(200);    //first insert will become root.
        bt.insert(500);    // second insert will become right child of root.
        bt.insert(400);    // this will become left child of root.
        bt.insert(600);    // this will become right child of root's left child
        bt.insert(800);    //
        bt.insert(750);
        bt.display();
    }
}