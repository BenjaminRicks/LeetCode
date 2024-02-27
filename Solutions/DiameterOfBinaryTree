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
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return diameter;
    }

    public int helper(TreeNode node) {
        if(node == null) return -1;
        int left = helper(node.left) + 1;
        int right = helper(node.right) + 1;
        if(diameter < right + left)  {
            diameter = right + left;
        }
        return Math.max(left, right);
    }

}
