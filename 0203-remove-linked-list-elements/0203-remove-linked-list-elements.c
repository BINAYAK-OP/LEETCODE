/**
 * Definition for singly-linked list->
 * struct   struct ListNode* {
 *     int val;
 *     struct   struct ListNode* *next;
 * };
 */
  struct ListNode* removeElements(  struct ListNode* head, int val) {
    while(head!=NULL && head->val==val)
        {
            head=head->next;
        }
        if(head==NULL)
        return NULL;
       struct ListNode* temp=head;
       struct ListNode* i;
        while(temp!=NULL && temp->next!=NULL)
        {
            if(temp->next->val==val)
            {
                i=temp->next;
                while(i!=NULL && i->val==val)
                i=i->next;

                temp->next=i;
            }
            temp=temp->next;
        }
        return head;
    }
