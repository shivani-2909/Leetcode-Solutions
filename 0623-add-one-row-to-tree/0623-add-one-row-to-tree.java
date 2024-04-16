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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
         return add(root,val,depth,1);
    }
    public TreeNode add(TreeNode root, int val, int depth,int curr){
        if(depth==1){
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        if(root==null){
            return null;
        }
        if(curr==depth-1){
            TreeNode ltemp = root.left;
            TreeNode rtemp = root.right;
            
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            
            root.left.left = ltemp;
            root.right.right = rtemp;
            
            return root;
        }
        root.left = add(root.left,val,depth,curr+1);
        root.right = add(root.right,val,depth,curr+1);
        
        return root;
    }
}