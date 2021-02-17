package jianzhioffer;

public class JianZhiOffer_24 {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode first=new ListNode(0);
        first.next=head;

        ListNode p=head.next,q=null;
        head.next=null;
        while(p!=null){
            q=p.next;
            p.next=first.next;
            first.next=p;
            p=q;
        }
        return first.next;
    }
}
