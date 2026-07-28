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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr != null)
        {
            if(curr.val != val)
            {
                list.add(curr.val);
            }
            curr = curr.next;
        }
        curr = new ListNode(0);
        ListNode newNode = curr;
        for(int ele : list)
        {
            curr.next = new ListNode(ele);
            curr = curr.next;
        }
        return newNode.next;
    }
}