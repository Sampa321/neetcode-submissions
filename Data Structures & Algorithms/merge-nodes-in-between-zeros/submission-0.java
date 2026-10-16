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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        int sum = 0;
        while(temp != null)
        {
            if(temp.val == 0 && sum != 0)
            {
                list.add(sum);
                sum = 0;
            }
            sum += temp.val;
            temp = temp.next;
        }
        ListNode newNode = new ListNode(list.get(0));
        ListNode re = newNode;
        for(int i = 1; i < list.size(); i++)
        {
            newNode.next = new ListNode(list.get(i));
            newNode  = newNode.next;
        }
        return re;
    }
}
