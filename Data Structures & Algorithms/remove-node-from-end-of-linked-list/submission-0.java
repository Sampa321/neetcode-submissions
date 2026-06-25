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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while(curr != null)
        {
            size++;
            curr = curr.next;
        }
        if(size-n == 0) return head.next;
        curr = head;
        for(int i = 1; i < size; i++)
        {
            if(i == size-n)
            {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
