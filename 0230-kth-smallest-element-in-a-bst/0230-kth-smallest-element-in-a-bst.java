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
        List<Integer> pq = new ArrayList<>();
        int result = 0;
        
        traverse(pq, root);

        // for (int i = 0; i < k; i++) {
        //     result = pq.poll();
        // }

        // return result;
        return pq.get(k-1);
    }

    private void traverse(List<Integer> pq, TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(pq, root.left);
        pq.add(root.val);
        traverse(pq, root.right);
    }
}