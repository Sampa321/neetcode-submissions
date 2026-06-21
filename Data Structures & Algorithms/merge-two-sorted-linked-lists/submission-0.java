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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ArrayList<Integer> list = new ArrayList<>();
        while(list1 != null)
        {
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null)
        {
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
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