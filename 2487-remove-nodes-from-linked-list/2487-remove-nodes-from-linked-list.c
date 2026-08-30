/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNodes(struct ListNode* head) {
    
    struct ListNode* st[100000];
    int top = -1;

    struct ListNode* temp = head;

    while(temp != NULL)
    {
        while(top >= 0 && st[top]->val < temp->val)
        {
            top--;
        }

        st[++top] = temp;
        temp = temp->next;
    }

    temp = NULL;

    while(top >= 0)
    {
        struct ListNode* node = st[top--];
        node->next = temp;
        temp = node;
    }

    return temp;
}