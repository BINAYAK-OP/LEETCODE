
//class Solution {
//    public ListNode oddEvenList(ListNode head) {
//        ListNode d1=new ListNode(-1);
//        ListNode d2=new ListNode(-1);
//      ListNode t1=d1;
//        ListNode t2=d2;
//        ListNode t=head;
//        int x=1;
//        while(t!=null)
//        {
//            if(x%2==1)
//            {
//                t1.next=t;
 //               t1=t1.next;
 //           }
 //          else
 //           {
 //               t2.next=t;
 //               t2=t2.next;
//          }
//            t=t.next;
//            x++;
//        }
//        t1.next=d2.next;
//        t2.next=null;
//        return d1.next//;

//    }
//
//}
class Solution {
   public ListNode oddEvenList(ListNode head) {
    if(head==null || head.next==null)
    return head;
    ListNode i=head;
    ListNode j=head.next;
    ListNode t=head.next;
    while(i.next!=null && j.next!=null)
    {
        i.next=j.next;
        i=i.next;

        j.next=i.next;
        j=j.next;
    }
    i.next=t;
    return head;
   }
}