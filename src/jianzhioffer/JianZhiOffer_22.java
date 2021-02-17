package jianzhioffer;

public class JianZhiOffer_22 {
    public static void main(String[] args) {

    }
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p=head;
        ListNode q=head;
        for(int i=0;i<k-1;i++){
            p=p.next;
        }
        while (p!=null){
            p=p.next;
            q=q.next;
        }
        return q;
    }
}
