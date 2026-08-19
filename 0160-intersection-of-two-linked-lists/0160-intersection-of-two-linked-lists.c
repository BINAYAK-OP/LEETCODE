/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *head1, struct ListNode *head2) {
    struct ListNode* temp=head1;
    struct ListNode* head3=NULL;
    int len1=0,len2=0;
    while(temp!=NULL)
    {
        temp=temp->next;
        len1++;
    }
    temp=head2;
    while(temp!=NULL)
    {
        temp=temp->next;
        len2++;
    }
    if(len1>len2)
    {
        for(int j=1;j<=len1-len2;j++)
        {
            head1=head1->next;
        }
        while(head1!=NULL && head2!=NULL)
        {
            if(head1==head2)
            {
                return head1;
            }
            head1=head1->next;
            head2=head2->next;
        }
    }
    else
    {
         for(int j=1;j<=len2-len1;j++)
        {
            head2=head2->next;
        }
        while(head1!=NULL && head2!=NULL)
        {
            if(head1==head2)
            {
                return head1;
            }
            head1=head1->next;
            head2=head2->next;
        }
    }
        return head3;
    }
