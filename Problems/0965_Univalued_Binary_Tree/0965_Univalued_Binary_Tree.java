/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean treeHelper(TreeNode root, int value){
        if(root==null)return true;
        if(root.val!=value)return false;
        return treeHelper(root.left,value)&&treeHelper(root.right,value);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)return true;
        return treeHelper(root,root.val);
    }
}