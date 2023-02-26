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

// Approach: Recursion
// Time Complexity: Linear ~ O(n)
// Space Complexity: O(n)

class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode newHead) {
        // base case
        if (head == null) {
            return newHead;
        }

        ListNode next = head.next;
        head.next = newHead;
        newHead = head;
        head = next;

        return reverse(head, newHead);

    }
}