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
    public int pairSum(ListNode head) {
        ListNode i=head;
        int n=0,prevsum=0;
        while(i!=null)
        {
            i=i.next;
            n++;
        }
        ListNode k=head;
       int j;
       for(j=0;j<n/2;j++)
       {
        k=k.next;
       }
       k=reverse(k);
       ListNode p=head;
       ListNode q=k;
       while(p!=null && q!=null)
       {
        int sum=0;
        sum=p.val+q.val;
        p=p.next;
        q=q.next;
        if(sum>prevsum)
        {
        prevsum=sum;
        }
       }
       return prevsum;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=null;
        while(curr!=null)
        {
            fwd=curr.next;
            curr.next =prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
}