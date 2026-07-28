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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode t = head;
        int n = 0, i;

        // count length
        while(t != null) {
            t = t.next;
            n++;
        }

        // move k to middle
        ListNode k = head;
        for(i = 0; i < n/2; i++) {
            k = k.next;
        }

        // reverse second half
        ListNode second = reverse(k);
        
        // ❗ break first half
        ListNode temp = head;
        for(i = 0; i < n/2 - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;

        // merge
        ListNode p = head;
        ListNode q = second;

        while(p != null && q != null) {
            ListNode t1 = p.next;
            ListNode t2 = q.next;

            p.next = q;
            if(t1 == null) break;   // safety for odd case

            q.next = t1;

            p = t1;
            q = t2;
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}