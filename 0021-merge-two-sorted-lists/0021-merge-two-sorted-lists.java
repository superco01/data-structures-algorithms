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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var head = new ListNode();
        var temp = new ListNode(0, head);

        while (!(null == list1 && null == list2)) {
            if (null == list1) {
                head.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if (null == list2) {
                head.next = new ListNode(list1.val);
                list1 = list1.next;
            } else if (list1.val <= list2.val) {
                head.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                head.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            head = head.next;
        }

        return temp.next.next;
    }
}