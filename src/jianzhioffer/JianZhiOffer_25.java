package jianzhioffer;

public class JianZhiOffer_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;

        ListNode first=new ListNode(0),p=first;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                first.next=l1;
                l1=l1.next;
            }else {
                first.next=l2;
                l2=l2.next;
            }
            first=first.next;
        }
        first.next=l1==null?l2:l1;
        return p.next;

    }
}
