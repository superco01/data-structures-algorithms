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
    public ListNode reverseList(ListNode head) {
        ListNode tempHead = head;
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode tempNextNode = null;
        if (null == head) {
            return head;
        }
        while (currNode.next != null) {
            tempNextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = tempNextNode;
        }

        if (currNode.next == null) {
            tempHead.next = null;
            currNode.next = prevNode;
        }

        return currNode;
    }
}