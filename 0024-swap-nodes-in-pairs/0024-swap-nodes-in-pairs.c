/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
    */
    struct ListNode* swapPairs(struct ListNode* head) {
        if(head==NULL || head->next==NULL)
        return head;
    struct ListNode* d1=malloc(sizeof(struct ListNode));
        d1->val=-1;
        d1->next=NULL;
    struct ListNode* t=d1;
    struct ListNode* i=head;
    while(i!=NULL && i->next!=NULL)
    {

    struct ListNode* next = i->next->next;
        t->next=i->next;
        t=t->next;
        t->next=i;
        t=t->next;
        i=next;
    }
    t->next=i;
    return d1->next;
    }