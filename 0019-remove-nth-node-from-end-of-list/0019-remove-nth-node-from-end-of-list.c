/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head==NULL || head->next==NULL)
    return NULL;
    struct ListNode* temp=head; 
    int len=0;
    while(temp!=NULL)
    {
        temp=temp->next;
        len++;
    }
    if(n==len)
    return head->next;
    temp=head;
    for(int i=1;i<len-n;i++)
    {
        temp=temp->next;
    }
    temp->next=temp->next->next;
    return head;
}