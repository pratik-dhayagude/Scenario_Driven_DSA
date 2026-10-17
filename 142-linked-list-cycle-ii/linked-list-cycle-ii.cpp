class Solution {
public:
    ListNode *detectCycle(ListNode *head) 
    {
        if(head == NULL)
        {
            return NULL;

        }
        if(head -> next == NULL)
        {
            return NULL;
        }
        ListNode *slow = head, *fast = head;
        while(fast != NULL && fast-> next != NULL)
        {
            slow = slow-> next;
            fast = fast-> next -> next;
            if(slow == fast)
            {
                break;
            }

        }
        slow = head;
        if(fast == NULL || fast -> next ==NULL)
        {
            return NULL;
        }
       
        while(slow != fast)
        {
            slow = slow -> next;
            fast = fast-> next;
        }
        return slow;
    }
};