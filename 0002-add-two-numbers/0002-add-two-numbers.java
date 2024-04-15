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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var currentNode = new ListNode();
        var result = currentNode;
        var carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            var value = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            value += carry;
            var digit = value % 10;
            carry = value / 10;

            var newNode = new ListNode(digit);
            currentNode.next = newNode;
            currentNode = newNode;

            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
        }

        result = result.next;
        return result;
    }
}