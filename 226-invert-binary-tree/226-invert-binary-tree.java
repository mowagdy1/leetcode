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
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null){
            return root;
        }
        TreeNode inverted = new TreeNode(root.val);
        
        dfs(root,inverted);
        
        return inverted;
    }
    
    private void dfs(TreeNode node, TreeNode inverted){
        if(node.left !=null){
            inverted.right= new TreeNode(node.left.val);
            dfs( node.left, inverted.right);
        }
        if(node.right !=null){
            inverted.left= new TreeNode(node.right.val);
            dfs( node.right, inverted.left);
        }
    }
}