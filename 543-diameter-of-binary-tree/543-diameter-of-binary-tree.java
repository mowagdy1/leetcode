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

    int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null){
            return 0;
        }

        dfs(root);

        return max;
    }

    private int dfs(TreeNode root){
        int leftMax = 0;
        if(root.left !=null){
            leftMax = dfs(root.left);
        }
        int rightMax = 0;
        if(root.right !=null){
            rightMax = dfs(root.right);
        }

        max = Math.max(max, leftMax + rightMax);

        return Math.max( leftMax , rightMax ) +1;
    }
}