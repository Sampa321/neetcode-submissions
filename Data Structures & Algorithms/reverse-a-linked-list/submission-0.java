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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ArrayList<Integer> list = new ArrayList();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        ListNode temp = new ListNode();
        ListNode curr = temp;
        for(int i = 0; i < list.size(); i++)
        {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return curr.next;
    }
}
