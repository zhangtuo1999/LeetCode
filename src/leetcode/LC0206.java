package leetcode;

public class LC0206 {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        ListNode first=new ListNode(0);
        while (head!=null){
            ListNode tmp=head.next;
            head.next=first.next;
            first.next=head;
            head=tmp;
        }
        return first.next;
    }
}
