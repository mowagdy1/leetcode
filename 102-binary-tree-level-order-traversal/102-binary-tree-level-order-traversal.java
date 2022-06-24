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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> output = new ArrayList<>();
        if(root ==null){
            return output;
        }
        
        Queue<TreeNode> treeQueue = new ArrayDeque<>();
        treeQueue.add(root);
        
        while(!treeQueue.isEmpty()){
            
            int rowLength = treeQueue.size();
            List<Integer> row = new ArrayList<>();
            
            for(int i=0; i<rowLength; i++){
                TreeNode node = treeQueue.poll();
                row.add(node.val);
                
                if(node.left !=null){
                    treeQueue.add(node.left);
                }
                if(node.right !=null){
                    treeQueue.add(node.right);
                }
            }
           output.add(row);
        }
        return output;
    }
}