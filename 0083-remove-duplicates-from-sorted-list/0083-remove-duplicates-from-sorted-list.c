/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head==NULL)
    return NULL;
   struct ListNode* i=head;
   struct ListNode* j=head;
    while(j!=NULL)
    {
        if(i->val==j->val)
        {
            j=j->next;
        }
        else
        {
            i->next=j;
            i=j;
        }
    }
        i->next=j;
        return head;
    }
