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
    private static final String ARROW = "->";
    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        // List<String> result = new ArrayList<>();
        String path = "" + root.val;
        traverse(path, root);

        return result;
    }

    private void traverse(String path, TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                String newPath = path + ARROW + root.left.val;
                traverse(newPath, root.left);
            } 
            if (root.right != null) {
                String newPath = path + ARROW + root.right.val;
                traverse(newPath, root.right);
            } 
            if (root.right == null && root.left == null) {
                result.add(path);
            }
        }
    }
}