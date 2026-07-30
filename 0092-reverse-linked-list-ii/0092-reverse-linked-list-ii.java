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
//class Solution {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        ArrayList<ListNode> arr=new ArrayList<>();
//        ListNode temp=head;
//        while(temp!=null)
//        {
//            arr.add(temp);
//            temp=temp.next;
//        }
//        int i=left-1,j=right-1;
//        while(i<j)
//        {
//            ListNode t1=arr.get(i);
//            ListNode t2=arr.get(j);
//            arr.set(i,t2);
//            arr.set(j,t1);
//            i++;
//            j--;
//        }
//        for(i=0;i<arr.size()-1;i++)
//        {
//            arr.get(i).next=arr.get(i+1);
//        }
//        arr.get(arr.size()-1).next=null;
//        return arr.get(0);
//    }
//}

class Solution {
   public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode d=new ListNode(-1);
    ListNode t=d;
    d.next=head;
    int i;
    for(i=0;i<left-1;i++)
    {
        t=t.next;
    }
    ListNode tail1=t;
    ListNode head2=t.next;
    t=t.next;
    for(i=0;i<right-left;i++)
    {
        t=t.next;
    }
    ListNode tail2=t;
    ListNode head3=t.next;
    tail1.next=null;
    tail2.next=null;
    ListNode k=reverse(head2);
    tail1.next=k;
    head2.next=head3;
    return d.next;
   }
   public static ListNode reverse(ListNode head2)
   {
    ListNode curr=head2;
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