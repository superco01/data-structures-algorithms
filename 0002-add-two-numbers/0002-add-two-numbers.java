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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var result = new ListNode();
        var temp = result;
        var excess = 0;
        while (l1 != null || l2 != null || excess != 0) {
            var sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + excess;
            excess = 0;
            if (sum >= 10) {
                excess = sum / 10;
            }
            result.next = new ListNode(sum % 10);
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            result = result.next;
        }

        return temp.next;
    }
}