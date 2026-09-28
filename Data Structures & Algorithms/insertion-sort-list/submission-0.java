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
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode head1 = head;
        while(head1 != null)
        {
            list.add(head1.val);
            head1 = head1.next;
        }
        Collections.sort(list);
        ListNode temp = new ListNode(0);
        ListNode newNode = temp;
        for(int i = 0; i < list.size(); i++)
        {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return newNode.next;
    }
}