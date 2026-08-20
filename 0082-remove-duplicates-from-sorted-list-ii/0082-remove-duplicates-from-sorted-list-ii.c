/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {

    struct ListNode dummy;
    dummy.val = -1;
    dummy.next = head;

    struct ListNode* prev = &dummy;
    struct ListNode* curr = head;

    while(curr != NULL)
    {
        // Duplicate found
        if(curr->next != NULL && curr->val == curr->next->val)
        {
            int value = curr->val;

            // Skip all nodes having this value
            while(curr != NULL && curr->val == value)
            {
                curr = curr->next;
            }

            prev->next = curr;
        }
        else
        {
            // Current node is unique
            prev = curr;
            curr = curr->next;
        }
    }

    return dummy.next;
}