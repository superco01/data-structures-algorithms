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
        while (curr != null) {
            System.out.println("curr.val: " + curr.val);
            System.out.println("curr.next.val: " + curr.next.val);
            if (curr.next == null) {
                break;
            }
            forw = curr.next.next;
            curr.next.next = curr;
            prev = curr.next;
            curr.next = forw;
            curr = forw;
        }

        return dummy.next;
    }
}