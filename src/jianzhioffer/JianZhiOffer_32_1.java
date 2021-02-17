package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JianZhiOffer_32_1 {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(10);
        TreeNode A1=new TreeNode(12);
        TreeNode A2=new TreeNode(6);
        A.left=A1;
        A.right=A2;
        A1.left=new TreeNode(8);
        A1.right=new TreeNode(3);
        A2.left=new TreeNode(11);
        levelOrder(A);
    }
    public static int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list=new ArrayList();
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            System.out.println(node.val);
            list.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++)
            res[i]= list.get(i);
        return res;
    }
}
