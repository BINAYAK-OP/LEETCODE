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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
        return head;
        if(head.next==null)
        {
        head=head.next;
        return head;
    }
        ListNode slow=head;
       ListNode fast=head;
       int length=0;
    while( fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        length++;
    }
    ListNode t=head;
    for(int i=1;i<length;i++)
    {
        t=t.next;
    }
    t.next=slow.next;
    t=head;
    return t;

    }
}