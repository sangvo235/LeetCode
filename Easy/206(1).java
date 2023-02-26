/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Approach: Iteration
// Time Complexity: Linear ~ O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {

        // Initializing Pointers
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            // save next node
            next = curr.next;
            // reverse the link
            curr.next = prev;
            // advance previous pointer
            prev = curr;
            // advance current pointer
            curr = next;
        }
        // return prev as it is sitting at the new head now
        return prev;
    }
}