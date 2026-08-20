/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 int length(struct ListNode* head)
{
    int len=0;
    while(head!=NULL)
    {
        head=head->next;
        len++;
    }
    return len;
}
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if(head==NULL || head->next==NULL)
    return head;
    int n=length(head);
    k%=n;
    if(k==0)
    return head;
   struct ListNode* slow=head;
    struct ListNode* fast=head;
    for(int i=0;i<k;i++)
    {
        fast=fast->next;
    }
    while(fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next;
    }
    struct ListNode* a=slow->next;
     slow->next=NULL;
     struct ListNode* tail=a;
     while(tail->next!=NULL)
     {
        tail=tail->next;
     }
     tail->next=head;
     return a;
}
  