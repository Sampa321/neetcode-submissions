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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            if(list.isEmpty() || list.indexOf(head.val) == -1)
            {
                list.add(head.val);
            }
            head = head.next;
        }


        ListNode temp = new ListNode(0);
        ListNode re = temp;
        for(int i = 0;i < list.size(); i++)
        {
            ListNode newNode = new ListNode(list.get(i));
            temp.next = newNode;
            temp =temp.next;
        }
        return re.next;
    }
}
