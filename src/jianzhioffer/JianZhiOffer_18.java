package jianzhioffer;

public class JianZhiOffer_18 {

    public static void main(String[] args) {
        ListNode n1=new ListNode(4);
        ListNode n2=new ListNode(5);
        ListNode n3=new ListNode(1);
        ListNode n4=new ListNode(9);
        ListNode n5=new ListNode(6);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        deleteNode(n1,5);
    }

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode see=new ListNode(0);
        see.next=head;
        ListNode pre=see;
        while (head!=null){
            if(head.val==val){
                pre.next=head.next;
                break;
            }
            head=head.next;
            pre=pre.next;
        }
        return see.next;
    }
}
