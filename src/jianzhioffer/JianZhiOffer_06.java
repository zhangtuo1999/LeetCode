package jianzhioffer;

import java.util.Stack;

public class JianZhiOffer_06 {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);

//        head.next=new ListNode(3);
//        head.next.next=new ListNode(2);
        int[] res=reversePrint(head);
        for(int r:res)
            System.out.println(r);
    }
    public static int[] reversePrint(ListNode head) {

        //空指针
        if(head==null)
            return new int[0];
        //只有表头
        if(head.next==null)
            return new int[]{head.val};

        ListNode p=head;
        Stack<Integer> s=new Stack<Integer>();
        int length=0;
        while (p!=null){
            s.push(p.val);
            length++;
            p=p.next;
        }
        int[] res=new int[length];
        for(int i=0;i<res.length;i++){
           res[i]=s.pop();
        }
        return res;
    }


}
