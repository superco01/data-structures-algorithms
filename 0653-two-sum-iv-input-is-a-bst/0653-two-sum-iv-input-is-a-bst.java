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
    public boolean findTarget(TreeNode root, int k) {
        return findTarget(root, k, new HashSet<>());
    }

    private boolean findTarget(TreeNode root, int target, Set<Integer> seen) {
        if (null == root) {
            return false;
        }
        if (seen.contains(target - root.val)) {
            return true;
        }

        seen.add(root.val);
        return findTarget(root.left, target, seen) || findTarget(root.right, target, seen);
    }
}