/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    
    struct ListNode d;
    d.val = -1;
    d.next = NULL;

    struct ListNode* i=list1;
    struct ListNode* j=list2;
    struct ListNode* k=&d;
    while(i!=NULL && j!=NULL)
    {
        if(i->val<=j->val)
        {
            k->next=i;
            i=i->next;
        }
        else
        {
            k->next=j;
            j=j->next;
        }
        k=k->next;
    }
    if(i==NULL)
    k->next=j;
    else
    k->next=i;
    return d.next;
}