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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tempHead = head;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = null;
        ListNode forw = null;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        System.out.println(prev.val);
        System.out.println("");
        curr = prev.next;
        for (int i = 0; i < right - left; i++) {
            forw = curr.next;
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
            System.out.println(prev.val);
        }

        return dummy.next;
    }
}