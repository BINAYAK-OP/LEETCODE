/**
 * Definition for singly-linked list->
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 struct ListNode* reverse(struct ListNode* head)
 {
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* fwd;  

    while(curr != NULL)
    {
        fwd = curr->next;

        curr->next = prev;

        prev = curr;
        curr = fwd;
    }

    return prev;
 }
int pairSum(struct ListNode* head) {
    struct ListNode* temp=head;
    struct ListNode* i=head;
    int n;
    int max=-1;
    while(temp!=NULL)
    {
        temp=temp->next;
        n++;
    }
    temp=head;
     for(int k=1;k<n/2;k++)
    {
        temp=temp->next;
    }
    struct ListNode* head2=temp->next;
    temp->next=NULL;
    head2=reverse(head2);
     struct ListNode* j=head2;
     for(int k=0;k<n/2;k++)
    {
        int sum=i->val+j->val;
        if(sum>max)
        max=sum;
        i=i->next;
        j=j->next;
    }
return max;
}