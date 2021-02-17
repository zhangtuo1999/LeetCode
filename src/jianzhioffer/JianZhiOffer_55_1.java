package jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

public class JianZhiOffer_55_1 {
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int res=0;
        while (!queue.isEmpty()){
            res++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return res;
    }
}
