/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* merge(struct ListNode* list1, struct ListNode* list2)
{
    struct ListNode dummy;
    dummy.val = -1;
    dummy.next = NULL;

    struct ListNode* k = &dummy;

    while(list1 != NULL && list2 != NULL)
    {
        if(list1->val <= list2->val)
        {
            k->next = list1;
            list1 = list1->next;
        }
        else
        {
            k->next = list2;
            list2 = list2->next;
        }

        k = k->next;
    }

    if(list1 != NULL)
        k->next = list1;
    else
        k->next = list2;

    return dummy.next;
}

struct ListNode* sortList(struct ListNode* head)
{
    // 0 or 1 node is already sorted
    if(head == NULL || head->next == NULL)
        return head;

    // Find middle
    struct ListNode* slow = head;
    struct ListNode* fast = head->next;

    while(fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }

    // Split into two lists
    struct ListNode* right = slow->next;
    slow->next = NULL;

    // Sort both halves
    struct ListNode* left = sortList(head);
    right = sortList(right);

    // Merge
    return merge(left, right);
}