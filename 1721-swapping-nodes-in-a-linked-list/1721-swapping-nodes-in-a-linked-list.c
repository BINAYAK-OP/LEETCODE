/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapNodes(struct ListNode* head, int k) {
    struct ListNode* first=head;
    for(int i=1;i<k;i++)
    {
        first=first->next;
    }
    struct ListNode* second=head;
    struct ListNode* fast=first;
    while(fast->next!=NULL)
    {
        fast=fast->next;
        second=second->next;
    }
    int temp=first->val;
    first->val=second->val;
    second->val=temp;

    return head;
}