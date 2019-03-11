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
    public boolean isMirror(TreeNode left, TreeNode right){
        if(left==null&&right==null){return true;}
        if((left==null&&right!=null)||(left!=null&&right==null)){return false;}
        if(left.val!=right.val){return false;}
        return isMirror(left.left,right.right)&&isMirror(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        //make a tree iterator (dfs or bfs) and have left and right flipped, run comparison
        //let it take parameter of left or right, return list of iteration
        //faster way is iterate together, and return false as soon as error detected
        if(root==null){return true;}
        return isMirror(root.left,root.right);
    }

}