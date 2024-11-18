/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int result = 0;
        
        traverse(pq, root);

        for (int i = 0; i < k; i++) {
            result = pq.poll();
        }

        return result;
    }

    private void traverse(PriorityQueue<Integer> pq, TreeNode root) {
        if (root == null) {
            return;
        }

        pq.add(root.val);
        traverse(pq, root.left);
        traverse(pq, root.right);
    }
}