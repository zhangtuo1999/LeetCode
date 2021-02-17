package bitree;

import java.util.Stack;

public class Traversal_1 {
    public static void main(String[] args) {
       TreeNode A=new TreeNode(10);
       A.left=new TreeNode(6);
       A.right=new TreeNode(8);
       A.left.left=new TreeNode(9);
       A.left.right=new TreeNode(5);
       A.right.right=new TreeNode(7);

       preOrder(A);
       System.out.println();
       inOrder(A);
       System.out.println();
       postOrder(A);
    }

    public static void postOrder(TreeNode node) {

    }

    public static void inOrder(TreeNode node) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode p=node;
        while (p!=null||!s.empty()){
            if(p!=null){
                s.push(p);
                p=p.left;
            }else {
                p=s.pop();
                System.out.println(p.val);
                p=p.right;
            }
        }
    }

    public static void preOrder(TreeNode node){
        Stack<TreeNode> s=new Stack<>();
        TreeNode p=node;
        while (p!=null||!s.empty()){
            if(p!=null){
                System.out.println(p.val);
                s.push(p);
                p=p.left;
            }else {
                p=s.pop();
                p=p.right;
            }
        }
    }
}
