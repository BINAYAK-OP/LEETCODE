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
    public ListNode swapNodes(ListNode head, int k) {
        int temp;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        for(int i=0;i<k;i++)
        {
            prev=fast;
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        temp=prev.val;
        prev.val=slow.val;
        slow.val=temp;
        return head;
    }
}