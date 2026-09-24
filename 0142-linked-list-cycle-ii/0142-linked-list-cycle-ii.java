/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode small = head;
        ListNode fast = head;
        while (fast != null && fast.next != null)
        {
            small = small.next;
            fast = fast.next.next;

            if (small == fast)
            {
                small = head;

                while (small != fast)
                {
                    small = small.next;
                    fast = fast.next;
                }
                return small;
            }


        }
        return null;
    }
}