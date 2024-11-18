/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        int result = -1;
        Set<Integer> set = new TreeSet<>();
        traverse(set, root);

        if (set.size() < 2) {
            return result;
        }

        System.out.println(set);

        Iterator iterator = set.iterator(); 
        iterator.next();
        return (int) iterator.next();
        // return set.get(2);
    }

    private void traverse(Set<Integer> set, TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(set, root.left);
        set.add(root.val);
        traverse(set, root.right);
    }
}