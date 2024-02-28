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
    private int depth = 0;
    private int maxDepth = 0;
    private int winner;
    public int findBottomLeftValue(TreeNode root) {
        helper(root);
        return winner;
    }

    public void helper(TreeNode node) {
        if(node == null) return;
        depth++;

        if (maxDepth < depth) {
            maxDepth = depth;
            winner = node.val;
        } 

        findBottomLeftValue(node.left);
        findBottomLeftValue(node.right);

        depth--;
    }
}
