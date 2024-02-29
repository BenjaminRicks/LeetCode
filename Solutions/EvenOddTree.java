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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tempQueue = new LinkedList<>();
        int lastVal;

        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            tempQueue = new LinkedList<>();

            if(level % 2 == 0) {
                lastVal = Integer.MIN_VALUE;
            } else {
                lastVal = Integer.MAX_VALUE;
            }

            while(!queue.isEmpty()){
                TreeNode node = queue.remove();
                if(level % 2 == 0) {
                    if(node.val % 2 == 0 || lastVal >= node.val) return false;
                }
                else{
                    if(node.val % 2 != 0 || lastVal <= node.val) return false;
                }

                if (node.left != null) tempQueue.add(node.left);
                if (node.right != null) tempQueue.add(node.right);
                lastVal = node.val;

            }

            queue = tempQueue;
            level++;
        }
        return true;

    }
}
