class TreeNode{
    int data;
    TreeNode left,right;
}

public class MyBinarySearchTree {
    TreeNode root;
    void insert(int data){
        TreeNode node = new TreeNode();
        node.data = data;

        if(root == null){
            root= node;
        }
        else{
            TreeNode temp = root;
            TreeNode parent = null;
            while(temp!=null){
                parent = temp;
                if(node.data <= temp.data){
                    temp = temp.left;
                }
                else {
                    temp = temp.right;
                }
            }

            if(node.data<=parent.data){
                parent.left = node;
            }
            else {
                parent.right = node;
            }
        }
    }

    void display(){
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data+ " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.display();
    }

}