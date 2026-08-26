/**
 * Definition for singly-linked list->
 * struct  ListNode* {
 *     int val;
 *     struct  ListNode* *next;
 * };
 */
 struct ListNode* reverse(struct ListNode* head2);
struct  ListNode* reverseBetween(struct  ListNode* head, int left, int right) {
    struct ListNode d;
    d.val = -1;
    struct  ListNode* t=&d;
    d.next=head;
    int i;
    for(i=0;i<left-1;i++)
    {
        t=t->next;
    }
   struct  ListNode* tail1=t;
    struct  ListNode* head2=t->next;
    t=t->next;
    for(i=0;i<right-left;i++)
    {
        t=t->next;
    }
    struct  ListNode* tail2=t;
    struct  ListNode* head3=t->next;
    tail1->next=NULL;
    tail2->next=NULL;
    struct  ListNode* k=reverse(head2);
    tail1->next=k;
    head2->next=head3;
    return d.next;
   }
    struct ListNode* reverse( struct ListNode* head2)
   {
     struct ListNode* curr=head2;
     struct ListNode* prev=NULL;
      struct ListNode* fwd=NULL;
    while(curr!=NULL)
    {
        fwd=curr->next;
        curr->next=prev;
        prev=curr;
        curr=fwd;
    }
    return prev;
   }
