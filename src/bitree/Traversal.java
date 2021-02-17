package bitree;

public class Traversal {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(10);
        A.left=new TreeNode(6);
        A.right=new TreeNode(8);
        A.left.left=new TreeNode(9);
        A.left.right=new TreeNode(5);
        A.right.right=new TreeNode(7);

        System.out.println();
        preOrder(A);
        System.out.println();
        inOrder(A);
        System.out.println();
        postOrder(A);
    }

    public static void postOrder(TreeNode node) {
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.val);
        }
    }

    public static void inOrder(TreeNode node) {
        if(node!=null){
            inOrder(node.left);
            System.out.println(node.val);
            inOrder(node.right);
        }
    }

    public static void preOrder(TreeNode node){
        if(node!=null){
            System.out.println(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
