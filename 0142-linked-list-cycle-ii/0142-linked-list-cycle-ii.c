/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode *slow=head;
    struct ListNode *fast=head;
    struct ListNode *temp=head;
    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast)
        {
            while(temp!=slow)
            {
                temp=temp->next;
                slow=slow->next;
            }
            return temp;
        }
    }
    return NULL;
}