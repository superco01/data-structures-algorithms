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
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        ListNode tempHead = head;
        ListNode forw = null;
        ListNode prev = dummy;
        ListNode result = head;
        boolean toggle = true;
        while (curr != null) {
            System.out.println("curr.val: " + curr.val);
            if (curr.next == null) {
                break;
            }
            forw = curr.next.next;
            curr.next.next = curr;
            prev.next = curr.next;
            prev = curr;
            if (toggle) result = curr.next;
            curr.next = forw;
            curr = curr.next;
            toggle = false;
            // System.out.println("result.next.val: " + result.next.val);
        }

        return result;
    }
}