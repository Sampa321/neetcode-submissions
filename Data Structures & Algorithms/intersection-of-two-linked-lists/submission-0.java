/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int size1 = 0;
        int size2 = 0;
        while(temp1 != null)
        {
            size1++;
            temp1 = temp1.next;
        }
        while(temp2 != null)
        {
            size2++;
            temp2 = temp2.next;
        }

        int size = 0;
        if(size1 > size2)
        {
            size = size1-size2;
            for(int i = 0; i < size; i++)
            {
                headA = headA.next;
            }
        }
        else
        {
            size = size2-size1;
            for(int i = 0; i < size; i++)
            {
                headB = headB.next;
            }
        }

        while(headA != null && headB != null)
        {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}