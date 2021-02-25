package sort;

public class LC0147 {
    public static void main(String[] args) {

    }
    public static ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode first=new ListNode(0);
        first.next=head;
        ListNode last=head,cur=head.next;
        while (cur!=null){
            if(cur.val>= last.val){
                last=last.next;
            }else {
                ListNode prev=first;
                while (prev.next.val<= cur.val){
                    prev=prev.next;
                }
                last.next=cur.next;
                cur.next=prev.next;
                prev.next=cur;
            }
            cur=last.next;
        }
        return first.next;
    }
}
