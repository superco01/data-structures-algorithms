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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        if (lists.length == 0) {
            return null;
        }

        for (var listNode : lists) {
            if (listNode == null) {
                return null;
            }
            while (listNode != null) {
                pq.add(listNode.val);
                listNode = listNode.next;
            }
        }

        var tempHead = new ListNode();
        var currentNode = tempHead;
        tempHead.next = currentNode;
        while (!pq.isEmpty()) {
            var val = pq.poll();
            var newNode = new ListNode(val);
            currentNode.next = newNode;
            currentNode = currentNode.next;
        }

        return tempHead.next;
    }
}