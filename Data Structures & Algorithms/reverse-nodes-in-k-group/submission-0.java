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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        for(int i = 0; i < list.size(); i += k)
        {
            int start = i;
            int end = i+k-1;
            if(end > list.size()-1) {
                break;
            }
            while(start <= end)
            {
                int temp = list.get(start);
                list.set(start, list.get(end));
                list.set(end, temp);
                start++;
                end--;
            }
        }
        ListNode head1 = new ListNode(list.get(0));
        ListNode curr = head1;
        for(int i = 1; i < list.size(); i++)
        {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return head1;
    }
}
