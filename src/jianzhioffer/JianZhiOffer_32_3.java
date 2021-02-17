package jianzhioffer;

import java.util.*;

public class JianZhiOffer_32_3 {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(10);
        TreeNode A1=new TreeNode(12);
        TreeNode A2=new TreeNode(6);
        A.left=A1;
        A.right=A2;
        A1.left=new TreeNode(8);
        A1.right=new TreeNode(3);
        A2.left=new TreeNode(11);
        System.out.println(levelOrder(A).toString());
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            boolean flag=false;
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                temp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);

            }
            if(res.size() % 2 == 1)
                Collections.reverse(temp);
            res.add(temp);
        }

        return res;
    }
}
