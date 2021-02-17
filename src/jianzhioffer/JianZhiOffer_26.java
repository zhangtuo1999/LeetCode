package jianzhioffer;

import java.util.Stack;

public class JianZhiOffer_26 {
    public static void main(String[] args) {
        /**
         * [10,12,6,8,3,11]
         * [10,12,6,8]
         */
        TreeNode A=new TreeNode(10);
        TreeNode A1=new TreeNode(12);
        TreeNode A2=new TreeNode(6);
        A.left=A1;
        A.right=A2;
        A1.left=new TreeNode(8);
        A1.right=new TreeNode(3);
        A2.left=new TreeNode(11);


        TreeNode B=new TreeNode(10);
        TreeNode B1=new TreeNode(12);
        B.left=B1;
        B.right=new TreeNode(6);
        B1.left=new TreeNode(8);

        System.out.println(isSubStructure(A,B));
    }
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null)
            return false;
        if(A==null)
            return false;
        String s1=treeToStr(A);
        String s2=treeToStr(B);
        return s1.contains(s2);
    }

    private static String treeToStr(TreeNode a) {
        String s="";
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = a;
        while (node != null || !stack.empty()) {
            if (node != null) {
                s+=node.val;
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                node = tem.right;
            }
        }
        System.out.println(s);
        return s;
    }
}
