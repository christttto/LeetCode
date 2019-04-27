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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        int myTotal=0;
        Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
        nodeQ.add(root);
        while(!nodeQ.isEmpty()){
            TreeNode currentNode = nodeQ.poll();
            if(currentNode.left!=null) {
                if(currentNode.left.left==null&&
                   currentNode.left.right==null) myTotal += currentNode.left.val;
                nodeQ.add(currentNode.left);
            }
            if(currentNode.right!=null) nodeQ.add(currentNode.right);
            
        }
        return myTotal;
    }
}