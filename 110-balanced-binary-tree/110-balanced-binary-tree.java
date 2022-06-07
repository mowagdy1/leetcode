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
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        
        if(root ==null){
            return true;
        }
        dfs(root);
        return balanced;
    }

    private int dfs(TreeNode root){
        int left = 0;
        int right = 0;
        if(root.left !=null){
            left = dfs(root.left);
        }
        if(root.right !=null){
            right = dfs(root.right);
        }
        
        if( Math.abs(left-right) > 1 ){
            balanced=false;
        }
        
        return Math.max(left,right) +1;
    }
}