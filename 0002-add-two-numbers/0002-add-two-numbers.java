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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        ListNode d=new ListNode (-1);
        ListNode t=d;
         int carry=0;
        while(p!=null || q!=null)
        {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum=carry+x+y;
            if(sum>9)
                carry=1;
            else
                carry=0;
                 t.next = new ListNode(sum % 10);   // ✅ create node
            t = t.next;
            
            if (p != null) p = p.next;         // ✅ safe move
            if (q != null) q = q.next;
        }
             if (carry > 0) {                      // ✅ final carry
            t.next = new ListNode(carry);
        }
        return d.next;
    }
    public static ListNode reverse(ListNode head)
   {
    ListNode curr=head;
    ListNode prev=null;
    ListNode fwd=null;
    while(curr!=null)
    {
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
    }
    return prev;
   }
}