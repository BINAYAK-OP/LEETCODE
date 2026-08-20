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
   struct ListNode* j=head->next;
    while(j!=NULL)
    {
        if(i->val==j->val)
        {
            struct ListNode* temp = j;
            j = j->next;
            free(temp);
        }
        else
        {
            i->next=j;
            i=j;
            j=j->next;
        }
    }
        i->next=NULL;
        return head;
    }
