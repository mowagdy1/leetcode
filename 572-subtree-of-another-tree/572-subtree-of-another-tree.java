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
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        
        if(sameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    private boolean sameTree(TreeNode root, TreeNode otherRoot){
        if(root == null && otherRoot == null){
            return true;
        }
        if(root == null || otherRoot == null){
            return false;
        }
        return (root.val == otherRoot.val 
                && sameTree(root.left, otherRoot.left) 
                && sameTree(root.right, otherRoot.right));
    }
    
}