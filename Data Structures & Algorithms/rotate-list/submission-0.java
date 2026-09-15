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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }

        int n = list.size();
        k %= n;
        ListNode curr = head;
        for(int i = n-k; i < n; i++)
        {
            curr.val = list.get(i);
            curr = curr.next;
        }

        for(int i = 0; i < n-k; i++)
        {
            curr.val = list.get(i);
            curr = curr.next;
        }
        return head;
    }
}