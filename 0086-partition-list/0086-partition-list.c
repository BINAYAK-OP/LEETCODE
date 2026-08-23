/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* partition(struct ListNode* head, int x) {
    struct ListNode *d1 = malloc(sizeof(struct ListNode));
    struct ListNode *d2 = malloc(sizeof(struct ListNode));
    d1->val=-1;
    d2->val=-1;
    struct ListNode *temp=head;
    struct ListNode *t1=d1;
    struct ListNode *t2=d2;
    while(temp!=NULL)
    {
        if(temp->val<x)
        {
            d1->next=temp;
            d1=d1->next;
        }
        else
        {
            d2->next=temp;
            d2=d2->next;
        }
        temp=temp->next;
    }
    d2->next=NULL;
    d1->next=t2->next;
    return t1->next;
}