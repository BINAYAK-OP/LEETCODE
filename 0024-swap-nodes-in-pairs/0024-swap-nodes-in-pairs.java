/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        return head;
         ListNode d1=new ListNode (-1);
    ListNode t=d1;
    ListNode i=head;
    while(i!=null && i.next!=null)
    {
        ListNode j=i.next;
        ListNode k=j.next;

        t.next=j;
        j.next=i;
        i.next=k;

        t=i;
        i=k;
    }
    return d1.next;
    }
}