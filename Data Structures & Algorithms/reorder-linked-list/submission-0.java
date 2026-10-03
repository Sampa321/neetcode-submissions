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
    public void reorderList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!= null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        ArrayList<Integer> newList = new ArrayList<>();
        int start = 0;
        int end = list.size()-1;
        while(start <= end)
        {
            newList.add(list.get(start));
            if(start != end)
            {
                newList.add(list.get(end));
            }
            start++;
            end--;
        } 

        curr = head;
        for(int i = 0; i < newList.size(); i++)
        { 
            curr.val = newList.get(i);
            curr = curr.next;
        }

    }
}
