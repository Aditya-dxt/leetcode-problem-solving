/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2)
    {
        ListNode* l1=list1;
        ListNode* l2=list2;
        if(l1==NULL)
            return l2;
        if(l2==NULL)
            return l1;
        ListNode* result;
        if(l1->val<l2->val)
        {
            result=l1;
            result->next=mergeTwoLists(l1->next,l2);
        }
        else
        {
            result=l2;
            result->next=mergeTwoLists(l1,l2->next);
        }
        return result;
    }
    //ListNode* mergeTwoLists(ListNode* list1,ListNode* list2)
    //{
    //    return solve(list1,list2);
    //}
};