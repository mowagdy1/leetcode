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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        
        Queue<TreeNode> treeQueue = new ArrayDeque<>();
        treeQueue.add(root);
        
        while(!treeQueue.isEmpty()){
            
            int length = treeQueue.size();
            for(int i=0; i<length;i++){
                
                TreeNode node = treeQueue.poll();
                if(i == length-1){
                    output.add(node.val);
                }
                
                if(node.left != null){
                    treeQueue.add(node.left);
                }
                if(node.right != null){
                    treeQueue.add(node.right);
                }
            }
            
        }
        return output;
    }
}